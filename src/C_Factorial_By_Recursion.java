
public class C_Factorial_By_Recursion {

	int fact = 1;
	
	public static void main(String[] args) {
	
		int no = 5;
		int result;
		C_Factorial_By_Recursion f = new C_Factorial_By_Recursion();
		result=f.callfact(no);
		System.out.println("Factoril of "+no+" is "+ result);
	}

	int callfact(int a) 
	{
		if (a >= 1) {
			fact = fact * a;
			callfact(a - 1);
		}
		return fact;
	}
	
}
