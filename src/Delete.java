// Java program to delete a file
import java.io.*;

public class Delete
{
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\Ashish\\Desktop\\1.txt");
		
		if(file.delete())
		{
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("Failed to delete the file");
		}
	}
}
