package college;

import java.util.Scanner;

public class faculty {
	public String fname;
	public void allocate()
	{
		System.out.println("Enter the Faculty name : ");
		Scanner input = new Scanner(System.in);
		fname = input.next();
	}
 
}