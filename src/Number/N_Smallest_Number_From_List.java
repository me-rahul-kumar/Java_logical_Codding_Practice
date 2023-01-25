package Number;

public class N_Smallest_Number_From_List {

	public static void main(String[] args) {

		
		int a[]= {3,4,6,9,8,10};
		int min=a[0];
		
		for(int i=0;i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
	}
}
