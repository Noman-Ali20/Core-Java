package com.tka.book;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
//		Books b1 = new Books("history of US","ID001",60.0,"Howard zinn","harper perenniel","historical",385);
		Books b1 = new Books("History of US","Zinn","harper","historical",101,80,350);
		Books b2 = new Books("The Guns of August","harper","presidio press","historical",102,100,400);
		Books b3 = new Books("History of Ancient Rome","mary beard","liveright","historical",103,150,450);
		Books b4 = new Books("java","jamesGosling","javaPublisher","technical",104,200,450);
		Books b5 = new Books("python","Guido van Rossum","pythonPublisher","technical",105,200,500);
		Books b6 = new Books("c++ ","bjarne stroustrup","cppPublisher","technical",106,250,600);
		Books b7 = new Books("good omens ","neil gaimen","gollancz","comedy",107,100,356);
		Books b8 = new Books("pg wodehouse ","pg wodehouse","w.w norton","comedy",108,100,400);
		Books b9 = new Books("ethical hacking ","sara","E.H Publisher","technical",109,500,1000);
		
		ArrayList<Books> names = new ArrayList<>();
		names.add(b1);
		names.add(b2);
		names.add(b3);
		names.add(b4);
		names.add(b5);
		names.add(b6);
		names.add(b7);
		names.add(b8);
		names.add(b9);
		
		for(Books s : names) {
			System.out.println("Book Name: "+s.getBookName());
			System.out.println("Book Author: "+s.getBookAuthor());
			System.out.println("Publisher: "+s.getPublisher());
			System.out.println("Book Category: "+s.getCategory());
			System.out.println("Book ID: "+s.getBookId());
			System.out.println("Book Price: "+s.getBookPrice());
			System.out.println("Book Pages: "+s.getPages());
			System.out.println("*********************************");
		}
		
		System.out.println("           HISTORICAL BOOKS             ");
		
		for(Books s : names) {
			if(s.getCategory().equals("historical")) {
			System.out.println("Book Name: "+s.getBookName());
			System.out.println("Book Author: "+s.getBookAuthor());
			System.out.println("Publisher: "+s.getPublisher());
			System.out.println("Book Category: "+s.getCategory());
			System.out.println("Book ID: "+s.getBookId());
			System.out.println("Book Price: "+s.getBookPrice());
			System.out.println("Book Pages: "+s.getPages());
			System.out.println("*********************************");
		
			}
		}
		
		System.out.println("           SPECIFIC AUTHOR BOOK             ");
		for(Books s : names) {
			if(s.getBookAuthor().equals("harper")) {
			System.out.println("Book Name: "+s.getBookName());
			System.out.println("Book Author: "+s.getBookAuthor());
			System.out.println("Publisher: "+s.getPublisher());
			System.out.println("Book Category: "+s.getCategory());
			System.out.println("Book ID: "+s.getBookId());
			System.out.println("Book Price: "+s.getBookPrice());
			System.out.println("Book Pages: "+s.getPages());
			System.out.println("*********************************");
		
			}
		}
		System.out.println("           PYTHON BOOK             ");
		for(Books s : names) {
			if(s.getBookName().equals("python")) {
			System.out.println("Book Name: "+s.getBookName());
			System.out.println("Book Author: "+s.getBookAuthor());
			System.out.println("Publisher: "+s.getPublisher());
			System.out.println("Book Category: "+s.getCategory());
			System.out.println("Book ID: "+s.getBookId());
			System.out.println("Book Price: "+s.getBookPrice());
			System.out.println("Book Pages: "+s.getPages());
			System.out.println("*********************************");
		
			}
		}
		System.out.println("           JAVA BOOK             ");
		for(Books s : names) {
			if(s.getBookName().equals("java")) {
			System.out.println("Book Name: "+s.getBookName());
			System.out.println("Book Author: "+s.getBookAuthor());
			System.out.println("Publisher: "+s.getPublisher());
			System.out.println("Book Category: "+s.getCategory());
			System.out.println("Book ID: "+s.getBookId());
			System.out.println("Book Price: "+s.getBookPrice());
			System.out.println("Book Pages: "+s.getPages());
			System.out.println("*********************************");
		
			}
		}
		
	}

}
