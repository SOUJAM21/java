public class Student extends Person{   
    int number;

    public Student(String name,int age,Address address,int number){
        super(name,age,address);
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
 

}