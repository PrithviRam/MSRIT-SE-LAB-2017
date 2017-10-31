package std;

import java.util.Scanner;

public class Student {
	String sname;
	String USN;
	String Email;
	public void display1()
	{
		System.out.println("Enter the student name");
		Scanner input=new Scanner(System.in);
		sname = input.next();
		System.out.println("Enter the Student usn");
		Scanner input1=new Scanner(System.in);
		USN = input1.next();
		System.out.println("Enter the phone number \n");
		Scanner input2=new Scanner(System.in);
		Email=input2.next();
		
	}

}
