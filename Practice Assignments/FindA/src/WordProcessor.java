
public class WordProcessor {
	public int findWord(String userInput){
		String[] userWord = userInput.split("");                                                                                   

		int numberofA = 0;
		
	        for ( int x=0; x<userWord.length; x++) {
	            if(userWord[x].equals("a")){
	            	numberofA++;
	            }
	        }
	        
	        //System.out.println(numberofA);
			return numberofA;
	    }
		
	}
