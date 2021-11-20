package Lec_8;
import java.util.*;
public class arr_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		disp(arr);
	}
	public static void disp(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}


}
