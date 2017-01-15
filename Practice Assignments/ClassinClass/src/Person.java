
public class Person {
	private String name;
	private int age;
	private Address homeAddress;
	private Address workAddress;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getHomeAddress(){
		return homeAddress;
	}
	
	public Address getWorkAddress(){
		return workAddress;
	}
	
	public void setHomeAddress(Address address){
		this.homeAddress = address;
	}
	
	public void setWorkAddress(Address address){
		this.workAddress = address;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo(){
		System.out.println(name + " " + age);
		System.out.println("Home Address: " + homeAddress.addressLineOne);
		System.out.println(homeAddress.city);
		System.out.println(homeAddress.state);
		System.out.println(homeAddress.zip);
		
		System.out.println("Work Address: " + workAddress.addressLineOne);
		System.out.println(workAddress.city);
		System.out.println(workAddress.state);
		System.out.println(workAddress.zip);
		
	}
}
