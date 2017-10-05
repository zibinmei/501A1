//Zibin Mei
//1085722
//Tut 01
//Ver 5


import java.util.Scanner;
import java.lang.Character;

//this class is like the messageboard.
public class UserInterface
{
	Scanner in = new Scanner(System.in);
	Manager list = new Manager();	
	
	//start method use to organize the class 
	public void start()
	{
		message();	
		while (true)
		{
			mainmenu();
			input();
		}
	}
	//main menu dispaly
	public void mainmenu()
	{
		System.out.println();
		System.out.println("[[[---------------]]]");
		System.out.println("[[[---MAIN MENU---]]]");
		System.out.println("[[[---------------]]]");
		System.out.println("(A)dd a movie to the collection");
		System.out.println("(D)isplay");
		System.out.println("(S)earch");
		System.out.println("(R)emove a movie from list");
		System.out.println("(O)pposite order display");
		System.out.println("(Q)uit ");
	}
	//welcome message
	public void message()
	{
		System.out.println("Welcome to the movie collector x1000");
		System.out.println("This program is for sorting your movie collection.");
		System.out.println("Created by me!");	
	}
	//quit message and exit program
	public void quit()
	{
		System.out.println("Logging off");
		System.exit(1);
	}

	//main menu prompt input for the user
	public void input()
	{
		System.out.print("Selection: ");
		String i=in.nextLine();
		String i2= i.toLowerCase();
		switch (i2)
		{
			case "a":
				list.addMovie();
				break;
			case "d":
				list.display();
				break;
			case "s":
				list.search();
				break;
			case "r":
				list.remove();
				break;
			case "o":
				list.oppsite();
				break;
			case "q":
				quit();
				break;
			default:
				System.out.println(">>>Invalid<<<");
				break;
		}
	}
}
