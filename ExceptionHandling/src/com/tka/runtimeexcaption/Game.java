package com.tka.runtimeexcaption;
import com.tka.compiletimeexcaption.*;
public class Game {
	public int age;

	private void run() {
		System.out.println("Please wait game is starting...");
	}

	public void start(int age) throws AgeTooBig  {    //throws-> write here bcz of CompileTimeException 
		if (age < 18) {
			throw new AgetooSmall("Your age too small to play game!!!"); //RunTimeException/Unchecked

		}else if(age >50)  {
			throw new AgeTooBig("Your age too big to play game!!!");    //CompleTimeException/Checked
		}
		else {
			
				System.out.println("You can play game..");
				run();
			
		}
			
	}

}
