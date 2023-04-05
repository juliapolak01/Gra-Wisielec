import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasyModeReader extends FileReader{
	List<String> arrayList = new ArrayList<>();
	String fileName = "slowaLatwe.txt";

	@Override
	public String readFile() { // Wylosuj słowo z pliku i je zwróć
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

	public String pickWord() { // Losowanie słowa
		return arrayList.get((int) (Math.random() * arrayList.size()));
	}

}
