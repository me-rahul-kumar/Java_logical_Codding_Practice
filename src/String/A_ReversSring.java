package String;

public class A_ReversSring {

	public static void main(String[] args) {
		
		String str="WELCOME TO JAVA";
		
		String[] strArray = str.split(" ");
		
		String reverseString="";
		for(String word:strArray)
		{
			String reverseWord="";
			
			for(int i=word.length()-1; i>=0; i--)
			{
				reverseWord=reverseWord+word.charAt(i);
				
			}
			reverseString=reverseString+reverseWord+" ";
		}

		System.out.println(reverseString);
	}

}
