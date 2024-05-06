package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_Serialization {
	public static void main(String[] args) throws Exception {
		File dir = new File("Serialization");

		File file  = new File(dir,"file1.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student obj = (Student) ois.readObject();          //here we did --> Typecasting
		System.out.println(obj.getName());
		System.out.println(obj.getMarks());
		System.out.println(obj.getRollNum());
	}
	
}
