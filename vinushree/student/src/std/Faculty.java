
package std;

import java.util.Scanner;

public class Faculty {
	public String fname,fid,femail;
 void getdata2()
	{
		System.out.println("Enter the Faculty name : ");
		Scanner input1 = new Scanner(System.in);
		fname = input1.next();
		System.out.println("Enter the Faculty id number : ");
		Scanner input2 = new Scanner(System.in);
		fid = input2.next();
		System.out.println("Enter the Faculty email id : ");
		Scanner input3 = new Scanner(System.in);
		femail = input3.next();
	}
 
}
