package com.tka.runtimeexcaption;

import com.tka.compiletimeexcaption.AgeTooBig;


public class Client {

	public static void main(String[] args) throws  AgeTooBig {
		Game g = new Game();
		
		g.start(19);
		

	}

}
