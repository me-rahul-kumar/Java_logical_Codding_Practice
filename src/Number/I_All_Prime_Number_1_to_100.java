package Number;

public class I_All_Prime_Number_1_to_100 {

	public static void main(String[] args) {

		for(int no=1; no<=100; no++)
		{
			int temp=0;
			
			for(int j=2;j<no-1;j++)
			{
				if(no%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(no);
			}
		}
	}
}
