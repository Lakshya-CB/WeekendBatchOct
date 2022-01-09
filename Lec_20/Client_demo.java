package Lec_20;

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
		System.out.println(s2==s1);
		System.out.println(s2.Name);
		System.out.println(s2.Age);
	}
}
