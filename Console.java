package animals;

import java.io.*;

public class Console
{
	private static InputStream in;
	public static BufferedReader br;

	public Console()
	{
		in = System.in;
		System.out.println("Console is ready.");
		System.out.println("Enter a command followed by ENTER.");
		System.out.print("> ");
		br = new BufferedReader(new InputStreamReader(in));
	}

	public char nextCmd()
	{
		try{
			int i = new Integer(br.readLine()); // ?!?!?!?
			

			if(i >= 1 && i <= 5)
			{
				return (char)(i+96);
			} else {
				System.out.println("Bad Command....");
			}
		}catch(Exception e){System.out.println("errors are fun, please input a number");}
		return 'f';
	}

	public static void main(String[] args)
	{
		// TODO
		// Here you must add code that does the
		// following:
		//  1) Check if the val is between 1 and 5,
		//     these are the allowable commands.
		//  2) If the val is between 1 and 5, return
		//     the corresponding character:
		//     1 -> 'a'
		//     2 -> 'b'
		//     3 -> 'c;
		//     4 -> 'd'
		//     5 -> 
		//  3) If the val is not between 1 and 5, print
		//     "Bad command", and try to read the input
		//     again.
		//
		//  Note: remember to deal with exceptions.

		Console whatever = new Console();
		char returned;
		while(true)
		{
			returned = whatever.nextCmd();
			if(!(returned == 'f'))
			{
				System.out.println(returned);
				System.exit(1);
			} else {
				continue;
			}

		}

	}
}
