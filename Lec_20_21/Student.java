package Lec_20_21;

public class Student {
	int Age = 200;
	String Name = "IDK";

	public Student() {
		Name = "PP";
	}

	public Student(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}

	public void Intro() {
		System.out.println("Hi my name " + Name + " my Age is " + Age);
//		System.out.println(this);
	}

	public void Intro(String Name, int Age) {
		System.out.println("Hi my name " + this.Name + " my Age is " + this.Age + " Nice to meet you " + Name
				+ " with Age " + Age);
	}

	public void party(Student s) {
		System.out.println("Yo ma boi " + s.Name + " party till " + s.Age);
	}

}
