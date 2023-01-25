package Number;

public class K_Palindrom_Number {
	//no and reverse number should be same

	public static void main(String[] args) {

		int no=121;
		int revnum=0;
		int remender;
		int temp=no;
		
		while(temp!=0)
		{
			remender=temp%10;
			revnum=revnum*10+remender;
			temp=temp/10;
		}
		//System.out.println(revnum);
		
		if(no==revnum)
		{
			System.out.println(no+": is a Palindrom Number");
		}
		else {
			System.out.println(no+": is not a Palindrom Number");
		}
		
		
		
	}
}
