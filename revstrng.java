package hoop;
import java.util.Scanner;
public class revstrng {
	
	public static void main(String args[]) {
		
		String actual, reverse = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the string");
		actual = scan.nextLine();
		scan.close();
		int len = actual.length();
		
		for (int i = len-1; i >= 0; i-- ) {
			reverse = reverse + actual.charAt(i);
			
		}
		
		System.out.println("Reverse of the string :" + reverse);
		
		
	}

}
