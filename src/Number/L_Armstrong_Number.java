package Number;

public class L_Armstrong_Number {
	//no and reverse number should be same

	public static void main(String[] args) {

		int no=153;
		//int no=152; not a armstrong number
		int temp=no;
		int temp2=no; //for armstrong
		int length=0; // for finding number of digit
		
		//finding number of digit
		while(temp!=0)
		{
			temp=temp/10;
			length=length+1;	
		}
		//System.out.println(length);
		
		int rem=0; int arm=0;
		while(temp2!=0)
		{
			rem=temp2%10;
			int multiplication=1;
			for(int i=1;i<=length; i++)
			{
				multiplication=multiplication*rem;
			}
			arm=arm+multiplication;
			temp2=temp2/10;
		}
		
		//System.out.println(arm);
		
		if(no==arm)
		{
			System.out.println(no+": is a armstrong number");
		}
		else {
			System.out.println(no+": is not a armstrong number");
		}
		
	}
}
