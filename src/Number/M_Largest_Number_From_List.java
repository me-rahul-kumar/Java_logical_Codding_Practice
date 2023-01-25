package Number;

public class M_Largest_Number_From_List {

	public static void main(String[] args) {

		
		int a[]= {3,4,6,9,8,10};
		int max=a[0];
		
		for(int i=0;i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
	}
}
