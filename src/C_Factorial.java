
public class C_Factorial {

	public static void main(String[] args) {
		
		int no=4;
		int fact=1; //must be mention other wise it will give negative value
		
		for(int i=1;i<=no; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
}
