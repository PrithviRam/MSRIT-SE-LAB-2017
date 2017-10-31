package std;

import java.util.Scanner;

public class Course {
	String cname,dept,fname;
	Student s1 = new Student();
	Faculty f1=new Faculty();
	
  

public void display1() {
	s1.display1();
	System.out.println("Student by name:\t"+s1.sname);
	s1.display1();
	  System.out.println("Student by usn:\t"+s1.USN);
	  System.out.println("course name:\t"+cname);
	  Scanner input = new Scanner(System.in);
	  cname= input.next();
	  f1.getdata2();
	  System.out.println("course name:\t"+f1.fname);

	
}

}
