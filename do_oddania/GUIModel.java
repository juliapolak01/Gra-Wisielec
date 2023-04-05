import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.TreeSet;

public class GUIModel {
    private final TreeSet<Character> letterGuesses = new TreeSet<>(); // kolkekcja przechowuje zganięte literki
    private final TreeSet<String> wordGuesses = new TreeSet<>(); // kolekcja przechowuje zgadnięte słowa
    private int lives = 6; // ilość żyć
    private String randomWord; // Losowe słowo do zganięcia
    private FileReader reader; 
    private int countWidnows = 1; // Zmienna pomocnicza zliczająca ilość otwartych okien

    public void openAddWordPage() { // Obsługa otwarcia okna do dodawania nowych słów
        if (countWidnows > 0) { // Sprawdź ile okien jest otwarte
            countWidnows--;
            AddWordPage page = new AddWordPage(this);
            Thread thread = new Thread(page);
            thread.start();
            page.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) { // Obsługa co ma się stać po zamknięciu okna
                    thread.interrupt();
                    countWidnows++;
                }
            });
        }
    }

    public void chooseLevel(int n) { // Na podstawie klikniętego guziaka wybierz słowo z odpowiedniego pliku
        if (n==0){
            reader = new EasyModeReader();
        }else if (n==1) {
            reader = new MediumModeReader();
        }else if (n==2) {
            reader = new HardModeReader();
        }
        setRandomWord(reader.readFile());
        System.out.println(randomWord); // To jest nie potrzebne ale niech zostanie
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
                newWord.append(randomWord.charAt(i)).append(" "); // Jeżeli literka jest to ją postaw
            }else{
                newWord.append("_ "); // Jeżeli to to postaw dasz
            }
        }
        return newWord.toString(); // Zwróć zbudowane słowo
    }

    public boolean isWinner() {
        int count = 0;
        for (int i = 0; i < randomWord.length(); i++) {
            if (letterGuesses.contains(randomWord.charAt(i))) { // Wejdź do kolekcji i sprawdź czy wszystkie literki zostały zganięte
                count++; // Zmienna pomocniczna zliczająca dobre literki
            }
        }
        return count == randomWord.length();
    }

    public boolean isLooser() { // Sprawdza czy nastąpiła porażka
        return this.lives <= 0;
    }

    public String setWord() { // Ustawia słowo w komponencie teksotwym
        return "_ ".repeat(randomWord.length()); // Jeżeli słowo ma 7 liter to zwróci 7 daszy
    }

    public void setLives(char c) { // Odejmnuje życia jeżeli kliknięta literka jest zła
        char[] word = randomWord.toCharArray();
        for(char letter : word) {
            if (letter == c){
                return;
            }
        }
        this.lives--;
    }

    public void addLetter(Character letter) {
        letterGuesses.add(letter); // Dodaje klikniętą literke do kolekcji
    }

    boolean checkDuplicates(String fileName, String word) { // Sprawdza czy proponowane słowo istenieje w bazie danych *dodawanie słów*
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

    public boolean verifyWord(String word) { // Weryfikacja poprawności słowa
        if(word.trim().isEmpty()){ // Sprawdź czy w ogóle jest wpisaner słowo, usuwa spacje wokół słowa, i sprawdza czy wynik jest pusty
            return false;
        }else{
            for(int i = 0; i < word.length(); i++){
                if(Character.isWhitespace(word.charAt(i))){ // czy słowo zawiera spacje
                    return false;
                }
            }
        }
        return true;
    }

    public void writeToFile(String filename, JTextField textField) { // Zapis słowa do pliku z użyciem strumieni
        try {
            FileOutputStream file = new FileOutputStream(filename, true);
            file.write("\n".getBytes(StandardCharsets.UTF_8));
            file.write(textField.getText().toLowerCase().getBytes(StandardCharsets.UTF_8));
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Zapis do odpowiedniego pliku według zaznaczonego pola
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

    public boolean checkDuplicateGuess(String word) { // Upewnia się,  ze uzytkownik nie będzie chciał zgadnąć tego samego słowa dwa razy
        if (wordGuesses.contains(word)) return false;
        wordGuesses.add(word);
        return true;
    }

    public void checkIllegalCharacters(String text) throws IllegalCharacterException{ // Sprawdza czy słowo zaiwera nielegalne znaki np. ! ? inne alfabety
        for(int i=0; i< text.length(); i++){
            int c = text.charAt(i);
            if(!((c>=65 && c<=90)||(c>=97 && c<=122)||((char)c == ' ')))
                throw new IllegalCharacterException("Non English Character");
        }
    }

    public boolean checkDifficulty(boolean easySelected, boolean mediumSelected, boolean hardSelected, JTextField textField) { // sprawdza czy słowo ma odpowiednią długość
        if (easySelected && textField.getText().length() > 5) return false;
        else if (mediumSelected && (textField.getText().length() <= 5 || textField.getText().length() > 11)) return false;
        else return !hardSelected || (textField.getText().length() >= 12 && textField.getText().length() <= 15);
    }

    public void reset() { // resrat gry
        setLives(6);
        letterGuesses.clear();
        wordGuesses.clear();
    }
}
