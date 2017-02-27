public class Address{
    String line1;
    String city;
    String state;
    int zip;

      public Address(String line1, String city, String state, int zip){
        this.line1 = line1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

     public String getLineOne(){
        return line1;
    } 

     public String getCity(){
        return city;
    }

     public String getState(){
        return state;
    }

     public int getZip(){
        return zip;
    }

}