import java.util.ArrayList;

class Program{
      String programName;
      int startTime;
      int duration;
      ArrayList<Participant> participants = new ArrayList<Participant>();

     public Program(String programName, int startTime, int duration){
        this.programName = programName;
        this.startTime = startTime;
        this.duration = duration;
        this.participants = new  ArrayList<Participant>();
}

    public String getProgramName(){
        return programName;
    } 

    public int getStartTime(){
        return startTime;
    }

    public int duration(){
        return duration;
    }

    public void addParticipant(Participant participant){
        participants.add(participant);
    }

     public ArrayList<Participant> getParticipants(){
        return participants; 
     }

}