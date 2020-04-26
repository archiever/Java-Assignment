package hoop;

public class permutation {
	public static void main(String[] args) {
		
		String str = "UPASANA";
		
		permutation(str, 0);
	}
	
	
	private static void permutation(String str, int pos) {
		
		int len = str.length();
		
		if (pos == len) {
			System.out.println(str);
			return;
		}
		
		for(int i = pos; i<len; i++) {
			
			str = swap(str,pos,i);
			permutation(str,pos+1);
			swap(str,i,pos);
		}
	}
	
	
	private static String swap(String str, int i, int j) {
		
		char arr[] = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return new String(arr);
	}
	
}
