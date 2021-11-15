package Lec_7;

public class Array_demo_2 {
	public static void main(String[] args) {
		int n = 5;
		char[] arr = new char[n];
		arr[0] = 'a';
		arr[1] = 'b';
		arr[2] = 'c';
		arr[3] = 'd';
		arr[4] = 'e';
//		way 1
		for(int idx = 0;idx<arr.length;idx++) {
			arr[idx]='L';
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
		
//		way 2 , for each loop enhanced loop
		for(char chooooo : arr) {
			chooooo='O';
			System.out.print(chooooo+" ");
		}
		System.out.println();
		System.out.println("===========");
//		simple print
		for(int idx = 0;idx<arr.length;idx++) {
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
		
		
	}
}
