package Lec_32;

public class Cloent {
	static class Child {
		String Name;
		int Age;

		public Child() {
			// TODO Auto-generated constructor stub
			Name = "HOLE Hole";
			Age = 100;
		}

		public String toString() {
			return Name + "  -  " + Age;
		}
	}

	public static void main(String[] aag) {
//		for(String lol : aag) {
//			System.out.println(lol);
//		}
		Integer I = 1;
		LinkedList_G<Child> LL = new LinkedList_G<>();
		LL.addFirst(new Child());
		LL.addFirst(new Child());
		LL.addFirst(new Child());
		LL.addFirst(new Child());

		LL.disp();

		System.out.println(Student.no_Students);
		Student a1 = new Student();
		Student a12 = new Student();
		Student a13 = new Student();
		Student a14 = new Student();
		System.out.println(Student.no_Students);

		int[] lvl = { 40, 20, 60, 10, 30, 50, 70, -1, -1, 25, -1, -1, 55, -1, -1, 23, -1, 52, -1, -1, -1, -1, -1 };
		BTree BT = new BTree(lvl, true);
		BT.Vertical();

	}
}
