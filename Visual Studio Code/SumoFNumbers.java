import java.util.Scanner;

public class SumoFNumbers{
    public static void main(String[] args){
      Math m1 = new Math();
      int num = 0;
     
     do{
        System.out.println("Enter a number(0 to end): ");
        Scanner s1 = new Scanner(System.in);
        int userNum = s1.nextInt();

        m1.storeNumber(userNum);

        if(userNum==0){
           num = m1.getFinalNum();
          break;
      }
     }while(true);
      System.out.println(num);

    }
}
          