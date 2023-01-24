package Search;

import java.util.Arrays;

public class B_BinarySearch2 {

	public static void main(String[] args) {
		
		int key=22;
		int a[]= {12,28,16,18,20};
		
		//for binary search array must be in sorted order
		
		int flag = Arrays.binarySearch(a, key);
		
		if(flag>0)
		{
			System.out.println("Element Found");
		}
		if(flag<0)
		{
			System.out.println("Element not found");
		}

	}

}
