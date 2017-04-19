import java.util.Scanner;

public class SumoFNumbers{
    public static void main(String[] args){
         
        int finalNum = 0;
        do{
              System.out.println("Enter a number");

             Scanner sc = new Scanner(System.in);
             int num = sc.nextInt();

             finalNum = finalNum + num;

             if(num==0){
                 System.out.println("Stopping...");
                 break;
             }
              
        }while(true);

        System.out.println(finalNum);

    }
        }
          