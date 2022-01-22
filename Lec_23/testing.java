package Lec_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class testing {
	public static void main(String[] args) throws Exception {
		FileInputStream file_data = null;
		file_data = new FileInputStream("C:/Users/ajeet/OneDrive/Desktop/Hello.txt");
		int m;
		while ((m = file_data.read()) != -1) {
			System.out.print((char) m);
		}
		file_data.close();
	}
}
