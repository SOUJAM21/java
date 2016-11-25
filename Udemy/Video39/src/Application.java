import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {
public static void main(String[] args) throws ParseException {
	
	Test test = new Test();
	
	
	try{
		test.run();
	}catch(Exception e){
		e.printStackTrace();
	}
	
	try{
		test.input();
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch (IOException e){
		e.printStackTrace();
	}
}
}
