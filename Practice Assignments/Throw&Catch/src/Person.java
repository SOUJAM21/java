
public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) throws Exception{
		if(name.length()==0){
			   throw new Exception("name cannot be empty.");
		}
		
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	
}
