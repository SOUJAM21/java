import java.util.Scanner;

public class ApplicationShape{
    public static void main(String[] args){
      ShapeFactory sf1 = new ShapeFactory();

      System.out.println("Enter a number");
      Scanner s1 = new Scanner(System.in);
      int userNum = s1.nextInt();
      
      Shape shape = sf1.getShape(userNum);
      if(shape != null){
        shape.Draw();
      }
      else{
        System.out.println("Shape does not exist");
      }
}
}