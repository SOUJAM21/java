import java.util.ArrayList;
import java.util.Scanner;

public class Game{
    ArrayList<Tower> towers = new ArrayList<Tower>();
    boolean loop = true;
    public void play() throws Exception{
        //setup
        setUp();
    //loop
        //show
        
        
        while(loop=true){
            show();

        System.out.println("Which Tower:");
       
       System.out.println("From:");
       Scanner s1 = new Scanner(System.in);
       int from = s1.nextInt();

       System.out.println("To:");
       Scanner s2 = new Scanner(System.in);
       int to = s2.nextInt();

      move(from,to);
}
        //move
        //if(isGameDone){
            //End Game
        //}
    //loop
    }

    private void setUp() throws Exception{
        //create three towers
        
        for(int i=0;i<3;i++){
            Tower tower = new Tower();
            towers.add(tower);
        }
        //create three discs
            Disc disc1 = new Disc(5);
            Disc disc2 = new Disc(11);
            Disc disc3 = new Disc(17);
            towers.get(0).addDisc(disc3);
            towers.get(0).addDisc(disc2);
            towers.get(0).addDisc(disc1);
        }
        //add three discs to tower #1

    private void move(int from,int to) throws Exception{
       Tower fromTower = towers.get(from-1);
       Tower toTower = towers.get(to-1);

       Disc movingDisc = fromTower.removeDisc();
       
       try{
        toTower.addDisc(movingDisc);
       }catch(Exception e){
           System.out.println("Cannot Put On Disc!!!");
            fromTower.addDisc(movingDisc);
       }
           
    }

    private void show(){
        //display towers
        for(int i=0; i<towers.size();i++){
            System.out.println("Tower: " + (i+1));
            Tower tower = towers.get(i);
            tower.show();
        }
    }

    private boolean isGameDone(){
        return false;
    }
}