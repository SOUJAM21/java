public class Application{
    public static void main(String[] args){
        Address address = new Address("17003 nw tucson street", "beaverton", "OR", 97006);
        
        Person p1 = new Person("Sourabh",16,address);

        System.out.println(p1.getName() + " " + p1.getAge() + " " + p1.getAddress() );

        Student s1 = new Student("Meghana",16,address,327002);

        s1.sleep();

    }
}