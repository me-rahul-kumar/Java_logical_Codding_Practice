
public class F_Maximum_Minimum_in_Three_Number {

	public static void main(String[] args) {

		int a = 10, b = 12, c = 13;

		if (a > b && a > c) {
			
			System.out.println(a + " is largest");
		} 
		else if (b > a && b > c) {
			System.out.println(b + " is largest");
		} 
		else {
			System.out.println(c + " is largest");
		}
		
		//second way
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+ " is greater");
			}	
		}
		else if(b>c)
		{
			System.out.println(b+ " is greater");
		}
		else
		{
			System.out.println(c+ " is greater");
		}
		
		
		

	}

}
