package abc;
import java.lang.*;

public class namaste
{	
	protected int z=42;

	public void display() 
	{
		System.out.println("Namaste Bhawuk!");
	}

	public static void main(String[] arg)
	{
		System.out.println("File Name -> hi.java");
		namaste n1 = new namaste();
		n1.display();
	}
}