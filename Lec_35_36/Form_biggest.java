package Lec_35_36;

import java.util.Arrays;
import java.util.Comparator;

public class Form_biggest {
	public static void main(String[] args) {
		Integer[] arr = {1,9,124,53,99,996,345,989,113};
		Arrays.sort(arr, new com());
		System.out.println(Arrays.toString(arr));
	}

	static class com implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
//			corner case when o1, o2 is 0.

			String a1 = "" + o1 + o2;
			String a2 = "" + o2 + o1;

			long A1 = Long.parseLong(a1);
			long A2 = Long.parseLong(a2);

			if (A1 >= A2) {
				return 1;
			} else if (A1 == A2) {
				return 0;
			} else {
				return -1;
			}
		}

	}
}
