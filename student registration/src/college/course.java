package college;

import java.util.Scanner;

public class course {
	String cname;
	student s1 = new student();
	public void register()
	{
		System.out.println("Enter the course name \n");
		Scanner input = new Scanner(System.in);
		cname= input.next();
		System.out.println(" \n department offer course:" + cname );
		s1.getdetails();
		System.out.println(" \n student register to course:" + cname );
		
	}

}
