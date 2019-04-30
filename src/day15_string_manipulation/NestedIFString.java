package day15_string_manipulation;

import java.util.*;

public class NestedIFString 
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Emoji:");
		String emoji = scan.next();

		if (emoji.length() == 2) 
		{
			if (emoji.charAt(0) == ':') 
			{
				switch (emoji.charAt(1)) 
				{
				case ')':
					System.out.println("Smile");
					break;
				case '(':
					System.out.println("sad");          
					System.out.println("Upset");
					break;
				case 'p':
					System.out.println("playful");
					break;
				default:
					return;
				}

			} else if (emoji.charAt(0) == ';') 
			{
				switch (emoji.charAt(1)) 
				{
				case ')':
					System.out.println("Wink");
					break;
				case 'O':
				case '0':
					System.out.println("surprised");
					break;
				default:
					return;

				}
				
				emoji.startsWith("j");
			}
		} else {
			System.out.println("Invalid emoji is more than 2 characters");
			return;
		}
	}
}
