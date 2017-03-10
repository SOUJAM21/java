public class Animal{
     int numberOfLegs;
     
     public Animal(int numberOfLegs){
       this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs(){
        return numberOfLegs;
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

    public void speak(){
        System.out.println("Animal Speaking");
    }

}