package Lec_20_21;

public class Client_demo_fn {
	public static void main(String[] args) {
		Student s = new Student();
		s.Name = "Slim Shady";
		s.Age = 53;
//		System.out.println(s);
//		s.Intro();
		s.Intro("Babushka",100);
		Student s2 = new Student();
		s2.Name = "Babushka";
		s2.Age = 100;
		
		s.party(s2);
		System.out.println("============");
		Student s3 = new Student();
		s3.Intro();
		
		System.out.println("============");
		Student s4 = new Student();
		s3.Intro();
		
	}
}
