
public class Application {
	
	public static void main(String[] args) {
		Person p1 = new Person("Sourabh", 16);
		
		//System.out.println(p1.getName());
		
		Address a1 = new Address("17003 NW tucson st", "beaverton", "OR", 97006);
		
		p1.setHomeAddress(a1);
		
		Address a2 = new Address("18003 SW johnson st", "gresham", "OR", 87022);
		
		p1.setWorkAddress(a2);
		
		p1.printInfo();
	}
}
