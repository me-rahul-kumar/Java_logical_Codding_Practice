package Search;

public class A_LinearSearch {

	public static void main(String[] args) {

		int key = 20; // I have to search this element in this array
		boolean flag = false;
		int a[] = { 12, 11, 14, 16, 20, 13 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				System.out.println("Element "+key+" found at postion: " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}

	}

}
