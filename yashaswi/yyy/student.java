package yyy;
import java.util.Scanner;

public class student {
	String stuname;
	String stuUSN;
	String stuEmailID;
	
	public void getinformation()
	{
		System.out.println("enter the student name");
		Scanner input=new Scanner(System.in);
		stuname=input.next();
		
		System.out.println("enter the student USN");
		Scanner input1=new Scanner(System.in);
		stuUSN=input1.next();
		
		System.out.println("enter the student emailId");
		Scanner input2=new Scanner(System.in);
		stuEmailID=input2.next();
		
	}

}
