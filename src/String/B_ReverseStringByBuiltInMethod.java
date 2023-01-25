package String;

public class B_ReverseStringByBuiltInMethod {

	public static void main(String[] args) {
		
		String str="WELCOME TO JAVA";
		
		String[] words = str.split("\\s"); //Splitting string with space

		String reverseString="";
		
		for(String word:words)
		{
			
			StringBuilder sb=new StringBuilder(word); //converting to StringBuilder
			
			reverseString=reverseString+sb.reverse().toString()+" "; 
			
		}

		System.out.println(reverseString);
	}

}
