public class StringCalc{
    private String word;
	
	public StringCalc(String word){
		this.word = word;
	}

    public int getNumLetters(){
         int length = word.length( );
         int spaces = word.length() - word.replace(" ", "").length();

         int numOfLetters = length - spaces;

         return numOfLetters;
    }

    public int getNumWords(){
        String[] wordArray = word.trim().split(" ");
        int wordCount = wordArray.length;

        return wordCount;

    }
}
