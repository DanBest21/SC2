import java.io.*;
import java.util.*;

public class BB_Interpreter 
{
	private static List<Integer> checkMissingSemicolons(BufferedReader input)
	{
		List<Integer> missingSemicolons = new ArrayList<Integer>();
		
		for (int i = 0; i < input.lines().count(); i++)
		{
			if (input.lines())
		}
		
		return missingSemicolons;
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bare Bones Interpreter");
		System.out.println("Please enter the full file path for the file that you wish to interpret.");
		
		String filePath = input.nextLine();
		
		input.close();
		
		try
		{
			BufferedReader file = new BufferedReader(new FileReader(filePath));
			
			List<Integer> liSemicolons = checkMissingSemicolons(file);
			
			if (!liSemicolons.isEmpty())
			{
				System.err.println("Error: The file is missing a semicolon on lines ");
				
				for (i = 0; i)
				System.err.print();
			}
		
			file.close();
		}
		catch (IOException ex)
		{
			System.err.println(ex.getCause() + ": " + ex.getMessage());
		}
	}

}
