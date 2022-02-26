package Lec_30_31;

import java.util.Comparator;

public class Generics_ {
	static class Student implements Comparable<Student>{
		String name;
		int marks;
		public Student(String N, int M) {
			// TODO Auto-generated constructor stub
			name = N;
			marks = M;
		}
		public String toString() {
			return "{ "+name + " "+ marks+" }";
		}
		@Override
		public int compareTo(Student o) {
//			this-o!!
			// TODO Auto-generated method stub
			return this.marks-o.marks;
		}
	}
	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4 };
		Student[] arr = new Student[4];
		arr[0] = new Student("Chomu",99);
		arr[1] = new Student("Khana Skip",2);
		arr[2] = new Student("PONGA",1);
		arr[3] = new Student("PAPPU",50);
		
		disp(arr);
//		sort(arr);
		sort(arr,new NameSort());
		
		disp(arr);
		
		
		
	}

	public static void disp(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static  void disp(Object[] arr) {
		for (Object i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static <UUU> void disp(UUU[] arr) {
		for (UUU i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

//	public static void sort(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
////					swap!!
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//	}

	public static <T extends Comparable<T>> void sort(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
				if(arr[j].compareTo(arr[j+1])>0) {
//					swap!!
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static <T> void sort(T[] arr, Comparator<T> CC) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
				if(CC.compare(arr[j],arr[j+1])>0) {
//					swap!!
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	static class NameSort implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
//			o1-o2
			return o1.name.compareTo(o2.name);
		}
		
	}
}
