import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.TreeSet;

public class GUIModel {
    private final TreeSet<Character> letterGuesses = new TreeSet<>();
    private final TreeSet<String> wordGuesses = new TreeSet<>();
    private int lives = 6;
    private String randomWord;
    private FileReader reader;
    private int countWidnows = 1;

    public void openAddWordPage() {
        if (countWidnows > 0) {
            countWidnows--;
            AddWordPage page = new AddWordPage(this);
            Thread thread = new Thread(page);
            thread.start();
            page.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    thread.interrupt();
                    countWidnows++;
                }
            });
        }
    }

    public void chooseLevel(int n) {
        if (n==0){
            reader = new EasyModeReader();
        }else if (n==1) {
            reader = new MediumModeReader();
        }else if (n==2) {
            reader = new HardModeReader();
        }
        setRandomWord(reader.readFile());
        System.out.println(randomWord);
    }

    public String getRandomWord() {
        return randomWord;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    // Metody zaimplementowane
    public String checkWord() {
        StringBuilder newWord = new StringBuilder();
        for(int i=0; i<randomWord.length(); i++) {
            if(letterGuesses.contains(randomWord.charAt(i))) {
                newWord.append(randomWord.charAt(i)).append(" ");
            }else{
                newWord.append("_ ");
            }
        }
        return newWord.toString();
    }

    public boolean isWinner() {
        int count = 0;
        for (int i = 0; i < randomWord.length(); i++) {
            if (letterGuesses.contains(randomWord.charAt(i))) {
                count++;
            }
        }
        return count == randomWord.length();
    }

    public boolean isLooser() {
        return this.lives <= 0;
    }

    public String setWord() {
        return "_ ".repeat(randomWord.length());
    }

    public void setLives(char c) {
        char[] word = randomWord.toCharArray();
        for(char letter : word) {
            if (letter == c){
                return;
            }
        }
        this.lives--;
    }

    public void addLetter(Character letter) {
        letterGuesses.add(letter);
    }

    boolean checkDuplicates(String fileName, String word) {
        try {
            var in = new Scanner(new InputStreamReader(new FileInputStream(fileName)));
            while (in.hasNext()){
                var nextWord = in.next();
                if (nextWord.equals(word)) return false;
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean verifyWord(String word) {
        if(word.trim().isEmpty()){
            return false;
        }else{
            for(int i = 0; i < word.length(); i++){
                if(Character.isWhitespace(word.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

    public void writeToFile(String filename, JTextField textField) {
        try {
            FileOutputStream file = new FileOutputStream(filename, true);
            file.write("\n".getBytes(StandardCharsets.UTF_8));
            file.write(textField.getText().toLowerCase().getBytes(StandardCharsets.UTF_8));
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean saveToFile(boolean easySelected, boolean mediumSelected, boolean hardSelected, JTextField textField) throws IllegalCharacterException {
        if (verifyWord(textField.getText())){
            checkIllegalCharacters(textField.getText());
            if(easySelected) {
                if (!checkDuplicates("slowaLatwe.txt", textField.getText().toLowerCase())) return false;
                writeToFile("slowaLatwe.txt", textField);
                return true;
            }else if(mediumSelected) {
                if (!checkDuplicates("slowaSrednie.txt", textField.getText().toLowerCase())) return false;
                writeToFile("slowaSrednie.txt", textField);
                return true;
            }else if(hardSelected) {
                if (!checkDuplicates("slowaTrudne.txt", textField.getText().toLowerCase())) return false;
                writeToFile("slowaTrudne.txt", textField);
                return true;
            }
        }
        return false;
    }

    public boolean checkDuplicateGuess(String word) {
        if (wordGuesses.contains(word)) return false;
        wordGuesses.add(word);
        return true;
    }

    public void checkIllegalCharacters(String text) throws IllegalCharacterException{
        for(int i=0; i< text.length(); i++){
            int c = text.charAt(i);
            if(!((c>=65 && c<=90)||(c>=97 && c<=122)||((char)c == ' ')))
                throw new IllegalCharacterException("Non English Character");
        }
    }

    public boolean checkDifficulty(boolean easySelected, boolean mediumSelected, boolean hardSelected, JTextField textField) {
        if (easySelected && textField.getText().length() > 5) return false;
        else if (mediumSelected && (textField.getText().length() <= 5 || textField.getText().length() > 11)) return false;
        else return !hardSelected || (textField.getText().length() >= 12 && textField.getText().length() <= 15);
    }

    public void reset() {
        setLives(6);
        letterGuesses.clear();
        wordGuesses.clear();
    }
}
