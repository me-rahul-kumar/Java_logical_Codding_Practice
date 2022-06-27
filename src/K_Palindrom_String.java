
public class K_Palindrom_String {
	
	public static void main(String[] args) {

		String str="aba";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("Given String is a Palindrom String: "+ rev);
		}
		else {
			System.out.println("Given String is not a Palindrom String: "+ rev);
		}
		
	}
}
