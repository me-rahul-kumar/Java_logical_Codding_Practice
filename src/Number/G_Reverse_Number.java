package Number;

public class G_Reverse_Number {

	public static void main(String[] args) {

		int no=12345;
		int rev=0;
		int rem;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
	}

}
