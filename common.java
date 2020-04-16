package hoop;
import java.util.Scanner;
public class common {
	public static void main(String args[]) {
		
		int arr1[];
		int arr2[];
		
		int len1, len2;
		int i , j;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of 1st array");
		
		len1 = scan.nextInt();
		arr1 = new int[len1];
		
		System.out.println("enter the elements");
		for(i=0; i<len1; i++) {
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Enter the length of 2nd array");
		len2 = scan.nextInt();
		arr2 = new int[len2];
		
		System.out.println("Enter elements");
		for(j=0; j<len2; j++) {
			arr2[j] = scan.nextInt();
		}
		
		for(i=0; i<len1; i++) {
			for(j=0; j<len2; j++) {
				if( arr1[i] == arr2[j]){
					System.out.print(arr1[i]);
					
				}
			}
		}
		
	}
}
