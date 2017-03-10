public class Person{
     Animal animal;
      public Person(Animal animal){
       this.animal = animal;
    }

    public void askAnimalToSpeak(){
        animal.speak();
    }
}