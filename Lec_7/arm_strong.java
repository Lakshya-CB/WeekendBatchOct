package Lec_7;

public class arm_strong {
	public static void main(String[] args) {
		int n = 1000;
		printArmstrong(n); 
	}

	public static void printArmstrong(int n) {
		for (int i = 1; i <= n; i++) {
			if (isArm(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isArm(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		int backup = num;
		int nod = numOfDig(num);
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			sum=sum + (int)Math.pow(digit,nod);
		}
		return backup==sum;
	}

	public static int numOfDig(int num) {
		int ans = 0;
		while (num > 0) {
			num = num / 10;
			ans++;
		}
		return ans;
	}
}
