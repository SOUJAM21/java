import java.util.ArrayList;

public class Application {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	
	list.add("apple");
	list.add("banana");
	list.add("orange");
	
	String fruit = (String)list.get(1);
	
	System.out.println(fruit);
	
	ArrayList<String> strings = new ArrayList<String>();
	
	strings.add("cat");
	strings.add("dog");
	strings.add("alligator");
	
	String animal = strings.get(1);
	
	System.out.println(animal);
	
	
}
}
