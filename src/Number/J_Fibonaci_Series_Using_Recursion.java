package Number;

public class J_Fibonaci_Series_Using_Recursion {

	public static int a=0,b=1,c;
	public static void main(String[] args) {

		System.out.println("Fibonaci Series 0 to 10");
		System.out.print(a+" "+b);
		
		J_Fibonaci_Series_Using_Recursion f=new J_Fibonaci_Series_Using_Recursion();
		f.fibonaci(10);
		
	}
	public void fibonaci(int no)
	{
		if(no>=1)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fibonaci(no-1);
		}
	}
}
