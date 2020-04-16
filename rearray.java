package hoop;

import java.util.Scanner;

public class rearray {

	public static void main(String[] args) {
		int arr[] = new int[100];
		int len;
		int i=0, j=0;
		int temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		len = scan.nextInt();
		
		System.out.println("ENter the elements of array");
		for(i=0; i<len; i++) {
			arr[i] = scan.nextInt();
		}
		
		j = i-1;
		i = 0;
		
		while(i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		System.out.println("reversed is :");
		for(i=0; i<len; i++) {
			System.out.println(arr[i]);
		}
	}

	}


