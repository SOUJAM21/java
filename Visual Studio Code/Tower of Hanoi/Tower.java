import java.util.*;

public class Tower{
    Deque<Disc> discs = new ArrayDeque<Disc>();
    public void addDisc(Disc disc){
        discs.push(disc);
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
}