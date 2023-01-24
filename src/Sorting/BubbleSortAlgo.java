package Sorting;

import java.util.Arrays;

public class BubbleSortAlgo {
	
	public static void main(String[] args) {
		
		int a []= {1,18,22,16,19,13};
		
		System.out.println("Array before sort: "+Arrays.toString(a));
		
		int n=a.length;
	
		for(int i=0; i<n-1;i++) //For loop for pass
		{
			for(int j=0; j<n-1;j++) //Iteration for swapping the value
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;					
				}
			}
		}
		System.out.println("Array after Sort: "+ Arrays.toString(a));
	}

}
