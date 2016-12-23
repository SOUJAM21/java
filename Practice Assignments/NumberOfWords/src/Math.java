import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Math {
	public int findWord(String userWord) throws IOException {

		FileReader inputFile = new FileReader("example.txt");
		BufferedReader br = new BufferedReader(inputFile);

		String readLine = "";

		int count = 0;
		while ((readLine = br.readLine()) != null) {
			String[] words = readLine.split(" ");
			for (String s : words) {
				if (s.equals(userWord)) {
					count++;
				}
			}
		}
		return count;
	}
}
