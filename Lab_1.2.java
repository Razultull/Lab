
import java.io.*;

public class Lab01
{

	public static void main (String[]args) throws Exception
	{
		String temp = "";
		char val;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true)
		{
			temp = br.readLine();
			if(temp.length() > 1)
				val = 'q';
			else
				val = temp.charAt(0);

			switch(val)
			{
			case 'a':
				System.out.println("Alligator");
				break;
			case 'b':
				System.out.println("Bear"); 
				break;
			case 'c':
				System.out.println("Cat");
				break;
			case'd':
				System.out.println("Dog");
				break;
			case 'e':
				System.out.println("Exiting...");
				System.exit(1); 
			default:
				System.out.println("Please enter a letter a-e...");
				break;
			}
		}

		//lol
		// TODO
		// Here you must add code to do the following:
		// 1) Read a command from the console.
		// 2) If the command is 'e', print "Exit" and
		//    exit the program using System.exit().
		// 3) Otherwise, print the corresponding message
		//    for each command:
		//    'a' -> "Alligator"
		//    'b' -> "Bear"
		//    'c' -> "Cat"
		//    'd' -> "Dog"
		// 4) Loop until the console returns an 'e'.
	}
}