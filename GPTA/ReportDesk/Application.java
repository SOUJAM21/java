import java.util.ArrayList;
import java.io.IOException;

class Application{
    public static void main(String [ ] args){     
       ProgramManager p1 = new ProgramManager();
      
       try{
         ArrayList<Program> programs = p1.loadPrograms("ProgramPerformance.txt"); 

             for(int i=0;i<programs.size();i++){
                 Program program = programs.get(i);
                 System.out.println(program.getProgramName()); 
             }
       }
       
       catch (java.io.IOException e){
            System.out.println(e.toString());
       }
       
    
    }
}