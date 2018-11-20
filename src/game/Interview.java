package game;

import java.util.Scanner;

public class Interview {
	/* 
	not completely sure what these do, they are fields
	still reading documentation 
	public static Object InitTest;
	public static Object AskName;
	 */

	//just a quick print to test functionality
	public static void InitTest() {
		System.out.print("Hello ");	
	}
	//scanners time B
	public static String AskName() {
	System.out.print("What is your name.");
	Scanner sc = new Scanner(System.in);
	String PlayerName = sc.next();
	return PlayerName; 
	}
	//Using variables across
	public static void RulesCheck() {
		System.out.print("Hello " + PlayerName + "welcome to plinco do you know the rules");
	}
}
