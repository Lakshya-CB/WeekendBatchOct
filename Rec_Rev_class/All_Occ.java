package Rec_Rev_class;

public class All_Occ {
	public static void main(String[] args) {
//		TOH('A', 'B', 'C', 4);
	}

	public static int[] all_O(int[] arr, int idx, int count, int ali) {
		if (arr.length == idx) {
			return new int[count];
		}

		if (arr[idx] == ali) {

			int[] ans = all_O(arr, idx + 1, count + 1, ali);
			ans[count] = idx;
			return ans;
		} else {
			int[] ans = all_O(arr, idx + 1, count, ali);
			return ans;
		}
	}

	public static void TOH(char src, char helper, char dest, int disks) {
		if (disks == 0) {
			return;
		}

		TOH(src, dest, helper, disks - 1);
		System.out.println("Shoft disk " + disks + " from " + src + " to " + dest);
		TOH(helper, src, dest, disks - 1);

	}
}
