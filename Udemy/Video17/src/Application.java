class Person{
	String name;
	int age;
	
	void speak(){
		for(int i=0; i<3; i++){
			System.out.println("My name is: " + name + "and i am" + age + "years old");
		}
	}
	
	void sayHello(){
		System.out.println("Hello there!");
	}
}


public class Application {
public static void main(String[] args) {
	Person person1 = new Person();
	person1.name = "Sourabh Jamalapuram";
	person1.age = 37;
	person1.speak();
	person1.sayHello();
	
	Person person2 = new Person();
	person2.name = "Sai Jamalapuram";
	person2.age = 20;
	person2.speak();
	person2.sayHello();
	
	System.out.println(person1.name + person1.age);
}
}
