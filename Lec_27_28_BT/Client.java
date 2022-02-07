package Lec_27_28_BT;

public class Client {
	public static void main(String[] args) {
		int[] pre ={10,20,40,30,60,90};
		int[] in ={40,20,10,60,30,90};
		
		BTree BT = new BTree(pre,in);
		BT.disp();
//		System.out.println("HT = "+BT.Ht());
//		System.out.println("*****************");
//		System.out.println("Dia = "+BT.Dia());
		
	}
}
