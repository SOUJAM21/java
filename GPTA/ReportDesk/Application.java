import java.util.ArrayList;

class Application{
    public static void main(String [ ] args){
            Participant participant = new Participant("Sourbh","sourabh.jamalapuram@gmail.com");

            Participant participant2 = new Participant("Meghana","meghana.narahari@gmail.com");

            Program pro = new Program("Amazing Allu Arjun Act",4,10);

            pro.addParticipant(participant);

            pro.addParticipant(participant2);

           
          ArrayList<Participant> list = pro.getParticipants();
           for(int i=0;i<list.size();i++){
               System.out.println(list.get(i).getName());
           }
    } 

}