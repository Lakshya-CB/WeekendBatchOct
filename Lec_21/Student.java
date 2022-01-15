package Lec_21;

public class Student {
	private int Age = 200;
	private String Name = "IDK";

	public Student() {

	}

	public Student(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}

	public String getName() {
		return this.Name;
	}

	public int getAge() {
		return this.Age;
	}

	public void setName(String Name) {
		this.Name = Name;

		return;
	}

	public void setAge(int Age)   {
//		try {
			if (Age < 0) {
//			??????? 
//				throw new Exception("Bhai kya?! kuch bhi!!");

				throw new RuntimeException("Bhai kya?! kuch bhi!!");
			}
//		} catch (Exception e) {
//			Age = 0;
//		}
		this.Age = Age;
		System.out.println("Done changes!!");
		return;
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
