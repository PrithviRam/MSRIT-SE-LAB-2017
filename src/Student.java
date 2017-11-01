+package college;
 +
 +import java.util.Scanner;
 +
 +public class student {
 +	String sname;
 +	String USN;
 +	public void getdetails()
 +	{
 +		System.out.println("Enter the student name");
 +		Scanner input=new Scanner(System.in);
 +		sname = input.next();
 +		System.out.println("Enter the Student usn");
 +		Scanner input1=new Scanner(System.in);
 +		USN = input1.next();
 +		
 +	}
 +
 +}