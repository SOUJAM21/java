import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
	public static void main(String args[]) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy hh.mm.ss.S aa");
		String formattedDate = dateFormat.format(new Date()).toString();
		System.out.println(formattedDate);
	}
}
