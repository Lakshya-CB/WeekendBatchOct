package Lec_20;

public class Client_demo_swap {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Age = 1000;
		s1.Name = "LOLI";

//	-----------Swapping Test-------------------------
		Student s3 = new Student();
		s3.Name = "s3";
		s3.Age = 30;

		Student s4 = new Student();
		s4.Name = "s4";
		s4.Age = 40;

		System.out.println(s3.Name + " " + s3.Age);
		System.out.println(s4.Name + " " + s4.Age);

		Test2(s3, s4);

		System.out.println(s3.Name + " " + s3.Age);
		System.out.println(s4.Name + " " + s4.Age);

	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}

	public static void Test2(Student s1, Student s2) {
		s1 = new Student();
		String temp_s = s1.Name;
		s1.Name = s2.Name;
		s2.Name = temp_s;

		int temp_i = s1.Age;
		s1.Age = s2.Age;
		s2.Age = temp_i;
	}
}
