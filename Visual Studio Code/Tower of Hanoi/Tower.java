import java.util.*;

public class Tower{
    Deque<Disc> discs = new ArrayDeque<Disc>();
    public void addDisc(Disc disc) throws Exception{
        Disc topDisc = discs.peek();
        if(topDisc == null || disc.getSize() < topDisc.getSize()){
            discs.push(disc);
        }
        else{
            throw new Exception("Cannot Put Disc!!!");
        }
        
    }

    public Disc removeDisc(){
        return discs.pop();
    }

    public void show(){
        for(Disc disc : discs){
            System.out.print("\t");
             for(int i=0;i<disc.getSize();i++){
                 System.out.print("-");
             }
             System.out.println(" ");
        }
    }

    public int getNumDiscs(){
        int numDiscSize = discs.size();
       // System.out.println("# of discs on 3: " + numDiscSize);
        return numDiscSize;
    }
}