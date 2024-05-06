package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		File file1 = new File("file1.txt");

		File file2 = new File("file2.txt");

		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		int i = 0;
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}
		fis.close();
		fos.close();
		System.out.println("File text copy from " + file1 + " To " + file2);
	}

}
