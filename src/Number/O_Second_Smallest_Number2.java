package Number;
import java.util.Arrays;

public class O_Second_Smallest_Number2 {

	public static void main(String[] args) {

		
		int a[]= {3,4,6,9,8,10};
		
		Arrays.sort(a); //short in ascending order
		
		int secondSmallest=a[1];
		
		System.out.println(secondSmallest); 
		
	}
}
