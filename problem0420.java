import java.util.Scanner;

public class problem0420 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a string!");
		Scanner key = new Scanner(System.in);
		String getString = key.nextLine();

		
		System.out.println("The Length is: " + getString.length());
		System.out.println("First Letter is: " + getString.charAt(0));
	}

}
