import java.util.Arrays;

public class O_Second_Largest_Number {

	public static void main(String[] args) {

		
		int a[]= {3,4,6,9,8,10};
		
		Arrays.sort(a); //short in ascending order
		
		int secondLargest=a[a.length-2];
		
		System.out.println(secondLargest); //9
		
	}
}
