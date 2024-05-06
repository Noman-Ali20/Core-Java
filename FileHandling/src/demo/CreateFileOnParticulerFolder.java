package demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileOnParticulerFolder {

	public static void main(String[] args) throws Exception {
		String directoryPath = "D:/JAVA Practice"; // Replace with your desired directory path

		// Create a folder
		File folder = new File(directoryPath, "FileHandling");
		boolean folderIsCreated = folder.mkdir();

		File file = new File(folder, "Test.txt");
		file.createNewFile();

		try {
      

            FileWriter writer = new FileWriter(file);
            writer.write("Hello\n");
            writer.write("Hi\n");

            writer.close(); // Close the FileWriter when done
        } catch (IOException e) {
            e.printStackTrace();
        }
		System.out.println("File length: "+file.length());

	}

}
