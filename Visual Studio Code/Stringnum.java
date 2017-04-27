public class Stringnum{
    public static void main(String[] args){
        String word = "Sourabh Hi Dad";

        StringCalc s1 = new StringCalc("My Name Is Bob");

        int numCharacters = s1.getNumLetters();

        int numWords = s1.getNumWords();

        System.out.println("There are: " + numWords + "words & " + numCharacters + "Letters"  );
    
}
}