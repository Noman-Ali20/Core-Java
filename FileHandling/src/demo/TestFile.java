package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFile {

	public static void main(String[] args) throws Exception {
		File dir = new File("JavaData");
		boolean folderCreated=dir.mkdir();                         //create a folder//return boolean value
		
		File file = new File(dir,"Test.txt");
		file.createNewFile();                                    //create a file
		System.out.println(file.getAbsolutePath());              //show path of the file or folder
		
		
		FileWriter fw = new FileWriter(file,true);           //if the append value is true means append opration
		                                               //if the append value is false the file data override means old data will be clear and new data added into file
//		BufferedWriter bfw = new BufferedWriter(fw);  
		
//		fw.write(65);                               //by write() data stored in the form of char or String
//		fw.write("\n");
//		fw.write("Hello");
//		fw.write("\n");
//		fw.write("How Are You");
//		fw.write("\n");
//		fw.write("Whats Going on?");
        
//		fw.flush();
//		fw.close();
		
		PrintWriter pw = new PrintWriter(file);  
		pw.println('A');                            //by println()you can store actual data
		pw.println("Hello");
		pw.println(65);
		pw.close();
		
		FileReader fr = new FileReader(file);
		
		
//it always return char value
//we need to repeat read().. so we can read by an other method i,e using char[]
//		System.out.println(fr.read());  read one charecter at a time
//		System.out.println(fr.read());
//		System.out.println(fr.read());
//		System.out.println(fr.read());
		
//		int i=0;
//		while((i=fr.read())  != -1) {
//			System.out.print((char)i);
//		}
		
//		BufferedReader br = new BufferedReader(fr);      //fasted way to read data
//		String line = br.readLine();                     // it will read all charecters in a single line
//		while(line != null) {
//			System.out.println(line);
//			line = br.readLine();
//		}
		
//		char [] arr = new char[(int)file.length()];
//		fr.read();
//		for(char c : arr) {
//			System.out.println(c);
//		}
	
		
	}

}
