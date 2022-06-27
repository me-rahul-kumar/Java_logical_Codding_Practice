import java.util.Scanner;

public class P_Insert_Value_in_array_And_add_the_numbers {

	public static void main(String[] args) {

		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int no = sc.nextInt();
		
		int arr[]=new int[no];
		
		for(int i=0;i<arr.length;i++)
		{
		
			System.out.println("Enter the value of array");
			arr[i]=sc.nextInt();
		}
		
		for(int a:arr)
		{
			sum=sum+a;
		}
		System.out.println("Sum of array is: "+sum);
		
	}
}
