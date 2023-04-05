import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MediumModeReader extends FileReader{
    List<String> arrayList = new ArrayList<>();
    String fileName = "slowaSrednie.txt";

    @Override
    public String readFile() {
        try {
            var in = new Scanner(new InputStreamReader(new FileInputStream(fileName)));
            while (in.hasNext()){
                var word = in.next();
                arrayList.add(word);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        }
        return pickWord();
    }

    public String pickWord() {
        Random random = new Random();
        return arrayList.get((int) (Math.random() * arrayList.size()));
    }

}
