package demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws Exception {
		File dir = new File("Serialization");
//		dir.mkdir();
		File file  = new File(dir,"file1.txt");
//		file.createNewFile();
//		System.out.println("File Created");
		Student s = new Student("jay",97,11);
		FileOutputStream fos = new FileOutputStream(file); 
		ObjectOutputStream oos = new ObjectOutputStream(fos);    //serialization
		oos.writeObject(s);                            //convert into a byte code
		System.out.println("Data stored");
		
		
	}

}
