import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ProgramManager{
/*
    public ArrayList<Program> loadPrograms(String fileName){
             
             ArrayList<Program> programs = new ArrayList<Program>();
             
             Participant participant = new Participant("Sourbh","sourabh.jamalapuram@gmail.com");

            Participant participant2 = new Participant("Meghana","meghana.narahari@gmail.com");

            Program pro = new Program("Amazing Allu Arjun Act",4,10);

            pro.addParticipant(participant);

            pro.addParticipant(participant2);

            programs.add(pro);
           
           return programs;
    } 
    */


    public ArrayList<Program> loadPrograms(String fileName) throws IOException{
        ArrayList<Program> programs = new ArrayList<Program>();
        FileReader inputFile = new FileReader("ProgramPerformance.txt");
		 BufferedReader br = new BufferedReader(inputFile);
		 String line;
         int lineNumber = 1;

         Program lastProgram = null;

          while((line = br.readLine()) != null){
             System.out.println(lineNumber);
             

             if(lineNumber % 2 == 1){
                Program program = new Program(line);
                programs.add(program);
                lastProgram = program;
             }
             else{
                 String [] participants = line.split(",");

                 for(int i=0;i<participants.length;i++){
                    Participant p1 = new Participant(participants[i],null);
                    lastProgram.addParticipant(p1);
                 }
             }
             
             lineNumber++;             
         }
         return programs;

    }

}