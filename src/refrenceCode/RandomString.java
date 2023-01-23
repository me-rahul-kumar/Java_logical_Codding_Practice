package refrenceCode;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		
		RandomString rs=new RandomString();
		rs.alphabaticString(50);

	}
	
	public void alphabaticString(int targetStringLength) {
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	    
	    generatedString= generatedString.toUpperCase();

	    System.out.println(generatedString);
	}

}
