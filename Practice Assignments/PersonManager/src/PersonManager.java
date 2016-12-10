import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	public ArrayList<Person> getPersons() throws FileNotFoundException{
		ArrayList<Person> persons = new ArrayList<Person>();
		
		String fileName = "People.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		int count = 1;
		while(in.hasNextLine()){
			try{
				String line = in.next();
				int age = in.nextInt();
				Person person = new Person(line,age);
				
				persons.add(person);
				count++;
			}catch(java.util.NoSuchElementException e){
				
			}
			
		}
		
		in.close();

		
		
		return persons;
		
	}
	
	public void addPerson(String name, int age) throws IOException{
		
		try(FileWriter fw = new FileWriter("People.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
				   PrintWriter out = new PrintWriter(bw))
		{
		
			out.print("\n" + name + "  " + age);
		
		
	}
		
		
	
}
	
	
	public void deletePerson() throws IOException{
		System.out.println("Enter a name");
		
		Scanner s2 = new Scanner(System.in);
		String name = s2.nextLine();
		
		String fileName = "example.txt";
		PersonManager manager = new PersonManager();
		
		ArrayList<Person> persons = manager.getPersons();
		
		boolean found = false;
		
		for(int i=0;i<persons.size();i++){
			Person p = persons.get(i);
			
			if(p.getName().equals(name)){
				System.out.println(p.getName() + p.getAge());
				found = true;
				
				persons.remove(p);
				break;
				
			}
		}
		
		if(found == false){
			System.out.println("Contact Not Found!!!");
		}
		
		
		
		FileWriter fw = new FileWriter("People.txt",false);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);
		for(int i=0;i<persons.size();i++){
			Person p = persons.get(i);	    
				out.println(p.getName() + "   " + p.getAge());
		}
		bw.close();
		fw.close();
		
	}
}
