package college;

import java.util.Scanner;

public class department {
	public String dname;
	faculty f1 = new faculty();
	 void display()
	{
		System.out.println("Enter the department name:");
		Scanner input1 = new Scanner(System.in);
		dname = input1.next();
		f1.allocate();
		
	}

}
