package college;

import java.util.Scanner;

public class student {;
	String sname;
	String USN;
	public void getdetails()
	{
		Scanner user_input=new Scanner(System.in);
		System.out.println("enter the student name");
		sname=user_input.next();
		System.out.println("Enter the Student usn");
		USN=user_input.next();

		
	}

}
public class course {
	String cname;
	student s1 = new student();
	public void register()
	{
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter the course name \n");
		cname=user_input.next();
		System.out.println(" \n department offer course:" + cname );
		s1.getdetails();
		System.out.println(" \n student register to course:" + cname );
		
	}

}
public class faculty {
	public String fname;
	public void allocate()
	{
		System.out.println("Enter the Faculty name : ");
		Scanner input = new Scanner(System.in);
		fname = input.next();
	}
 
}
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
public class college {
	String cname ;
	department d1 = new department();
	public void getcollegedetails()
	{
		System.out.println("Enter the college name: ");
		Scanner input = new Scanner(System.in);
		cname = input.next();
		d1.display();
		System.out.println("\n college has department:" + d1.dname  );
	}
	
}
public class main {

	public static void main(String[] args) 
	{
	college c1 = new college();
	course s1 = new course();
	System.out.println(" Registration\n");
	c1.getcollegedetails();
	s1.register();
	}

}





