package Number;
public class A_Prime_Number {

	public static void main(String[] args) {
		
		
		int no=7;
		int temp=0;
		int temp1=no;
		
		for(int i=2; i<no;i++)
		{
			temp1=temp1%2;
			if(temp1==0)
			{
				temp=temp++;
			}
		}
		if(temp>0)
		{
			System.out.println(no + "is not a prime number");
		}
		
		else
		{
			System.out.println(no + " is a prime number");
		}

	}

}
