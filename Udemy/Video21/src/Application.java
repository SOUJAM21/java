class Frog{
	String name;
	int age;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setInfo(String name, int age){
		setName(name);
		setAge(age);
	}
}
public class Application {
public static void main(String[] args) {
	Frog frog1 = new Frog();
	
	frog1.name = "Bertie";
	frog1.age = 1;
	
	System.out.println(frog1.getName());
	System.out.println(frog1.getAge());
}
}
