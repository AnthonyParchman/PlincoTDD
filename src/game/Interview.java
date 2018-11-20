package game;

import java.util.*;

public class Interview {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void InitTest() {
		System.out.print("Hello ");	
	}
	
	public static void AskName() {
		System.out.print("What is your name.");
	}
	
	public static String GetName() {
		String PlayerName = sc.next();
		return  PlayerName; 
	}
	
	public static void RulesCheck(String PlayerName) {
		System.out.print("Hello " + PlayerName + " welcome to plinco do you know the rules");
		boolean YesNo = sc.nextBoolean();	
		if (YesNo ==true) { 
			System.out.print("Good we will now continue");
		}else{
			System.out.print("You will pick complete a short quiz that will determine how many chips you get");
	}
	}
	
}
