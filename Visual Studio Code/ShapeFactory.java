public class ShapeFactory extends Shape{ 
    public Shape getShape(int userInput){
        if(userInput == 1){
            Circle c1 = new Circle();
            return c1;
        }
         else if(userInput == 2){
            Triangle t1 = new Triangle();
            return t1;
        }
         else if(userInput == 3){
            Square s1 = new Square();
            return s1;
        }
        else{
            return null;
        }

} 
}