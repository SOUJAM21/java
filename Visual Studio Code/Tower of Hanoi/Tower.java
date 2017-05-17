import java.util.*;

public class Tower{
    Deque<Disc> discs = new ArrayDeque<Disc>();
    public void addDisc(Disc disc){
        discs.push(disc);
    }

    public Disc removeDisc(){
        return null;
    }

    public void show(){
        for(Disc disc : discs){
             System.out.println("          " + disc.getSize() );
        }
    }
}