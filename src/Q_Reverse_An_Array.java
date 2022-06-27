public class Q_Reverse_An_Array {

	public static void main(String[] args) {

		int a[]= {12,11,5,4,5,6};
		System.out.println("Array before revese:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");	
		}
		
		//reversing array
		System.out.println();
		System.out.println("Array after revese:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");	
		}
	
		
		
	}
}
