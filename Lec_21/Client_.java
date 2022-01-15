package Lec_21;

public class Client_ {
	public static void main(String[] args) {
		Student s = new Student("DD", 25);
		System.out.println(s.getAge());
		System.out.println(s.getName());
//		try {
		System.out.println("try start");
		s.setAge(-200);
		System.out.println(s.getAge());
		System.out.println("try end");
//		} catch (Exception e) {
//			System.err.println("Ab to pakra gya!!");
//			System.err.println(e.getMessage());
//			e.printStackTrace();
//		} finally {
//			System.out.println("JADO end");
//		}

		System.out.println("End");
	}
}
