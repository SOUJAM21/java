import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class other {
 public void Add(String words) throws IOException{
	
	 FileWriter append = new FileWriter("/Users/Tarun/Documents/workspace/File/Untitled 4",true);
	 BufferedWriter bufferWriter = new BufferedWriter(append);
	 bufferWriter.write(" ");
	 bufferWriter.write(words );
	 bufferWriter.write(" ");
	 bufferWriter.newLine();
	 bufferWriter.close();
 }
}
