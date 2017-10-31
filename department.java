package yyy;
import java.util.Scanner;

public class department {
	public String depname;
	faculty f1= new faculty();
	void display()
	{
		System.out.println("enter the department name: \n");
		Scanner input1=new Scanner(System.in);
		depname = input1.next();
			f1.allocate();
		
	}

}
