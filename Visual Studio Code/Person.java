public class Person{   
    String name;
    int age;
    Address address;
    public Person(String name, int age,Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return name;
    }


    public int getAge(){
        return age;
    }

    public Address getAddress(){
        return address;
    }

    public void sleep(){
        System.out.println("Sleeping");
    }
}