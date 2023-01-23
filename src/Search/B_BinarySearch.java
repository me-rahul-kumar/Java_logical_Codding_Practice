package Search;

public class B_BinarySearch {
	
	public static void main(String[] args) {
		
		int a[]= {12,15,18,88,26,27};
		int key=18;
		boolean flag=false;
		int lowerBound=0;
		int HigerBound=a.length-1;

		while(lowerBound<=HigerBound)
		{
			int mid=(lowerBound+HigerBound)/2;
			
			if(a[mid]==key)
			{
				System.out.println("Element Found");
				flag=true;
				break;
			}
			
			if(a[mid]>key)
			{
				HigerBound=mid-1;
			}
			if(a[mid]<key)
			{
				lowerBound=mid+1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		
		
	}

}
