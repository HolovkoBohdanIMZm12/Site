package Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_6 
{

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) throws IOException   
	{
		
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scn = new Scanner(System.in);
		
		//============
		
		String arr1[];
		String arr2[][];
		String str = null;		
						
		//============
		
						
		System.out.println("Welcome to simple java console interprate.");
		System.out.println("Select the appropriate command:\n");
		System.out.print("Press 'ping' to selest the command: ping");
		System.out.print("\nPress 'echo' to selest the command: echo");
		System.out.print("\nPress 'login' to selest the command: login");
		System.out.print("\nPress 'list' to selest the command: list");
		System.out.print("\nPress 'msg' to selest the command: msg");
		System.out.print("\nPress 'file' to selest the command: file");
		System.out.print("\nPress 'exit' to selest the command: exit");
		
		//============
		
		System.out.println();
		System.out.println("\nEnter the command: ");
		
		//============
		
		try
		{		
			do
			{
				str = reader.readLine();
				arr1 = str.split(", ");
				switch (arr1[0]) 
				{
			    	case "ping": 	System.out.println("You entered command: Ping");  break;
			        case "echo": 	System.out.println("You entered command: Echo: " + String.join(" ", partsout(arr1,1)));  break;
			        case "login": 	System.out.println("You entered command: Login: <login name: " + arr1[1] + ">; <password: " + arr1[2] + ">");  break;
			        case "list": 	System.out.println("You entered command: List");  break;
			        case "msg": 	System.out.println("You entered command: Msg: <name of the msg: " + arr1[1] + ">; <Text of the msg: " + String.join(" ", partsout(arr1,2)) + ">");  break;
			        case "file":  	System.out.println("You entered command: File: <username: " + arr1[1] + ">; <filename: " + arr1[2] + ">");  break;
			        case "exit":  	System.exit(13);  break;
			        default: 		System.out.println("Incorrect command! Try again.");  break;
				}
			}	
			while((str = reader.readLine ()) != null);
		}
		catch(ArrayIndexOutOfBoundsException aobe)
		{
			System.out.println("ArrayIndexOutOfBoundsException!");
		}
		catch(Exception exc)
		{
			System.out.println("Exception!");
		}
		
		
	}
			
	//================
	
		static String[] partsout(String[] array, int index)
		{
			String [] result = new String[array.length-index];
			for (int i=index; i<(array.length); i++)
			{
				result[i-index] = array[i];
			}
			return result;
		}

}
