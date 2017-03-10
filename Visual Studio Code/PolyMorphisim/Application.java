public class Application{
    public static void main(String[] args){
         Cat c1 = new Cat(4);
         Dog d1 = new Dog(4);

         Person p1 = new Person(c1);

         Person p2 = new Person(d1);

         p1.askAnimalToSpeak();

         p2.askAnimalToSpeak();

    }
}