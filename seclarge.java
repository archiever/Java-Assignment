package hoop;
import java.util.Scanner;
public class seclarge {
	
	public static void main(String args[]) throws Exception{
		
		int arr[];
		int i,len;
		int large=0, slarge=0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		len = scan.nextInt();
		arr =new int[len];
		System.out.println("enter number of arrays");
		for(i=0; i<arr.length; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		for(i=0; i<arr.length; i++)
			if(arr[i]>large) {
				slarge = large;
				large = arr[i];
				
			}
		
			else if(arr[i] > slarge && arr[i]!=large) {
			slarge = arr[i];                                                           
			
		}
		
		System.out.println("The second largest number is : " + slarge);
	}
}
