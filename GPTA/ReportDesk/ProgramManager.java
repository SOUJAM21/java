import java.util.ArrayList;
class ProgramManager{
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
}