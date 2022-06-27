
public class H_Reverse_String {

	public static void main(String[] args) {

		String str="Rahul";
		
		int length = str.length();
		
		String revstr="";
		for(int i=length-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		
		System.out.println("Orignal String is: "+str);
		System.out.println("Reverse String is: "+revstr);
		
	}
}
