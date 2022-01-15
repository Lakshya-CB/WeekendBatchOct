package Lec_20_21;

public class Client_demo {
	public static void main(String[] args) {
		Student s = new Student(); // s is an instance or an object of your class/ noun student
		System.out.println(s);
		System.out.println(s.Age);
		System.out.println(s.Name);
		s.Age = 1000;
		s.Name = "LOLI";

		System.out.println(s.Name);
		System.out.println(s.Age);

		Student s1 = s;

		System.out.println(s1 == s);
		Student s2 = new Student();
		System.out.println(s2 == s1);
		System.out.println(s2.Name);
		System.out.println(s2.Age);

		System.out.println("===============");
		Student s3 = new Student();
		s3.Name = "S3";
		s3.Age = 30;
		Student s4 = new Student();
		s4.Name = "S4";
		s4.Age = 40;

//		Test2(s3, s4);
		int myAge = 32;
		String myName = "SlimShady";

		Test3(s3, s4.Name, s4.Age, myAge, myName);

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

	public static void Test3(Student s1, String name, int age, int myAge, String myName) {
		s1.Name = "_";
		s1.Age = 0;

		name = "_";
		age = 0;

		myName = "_";
		myAge = 0;

	}

}
