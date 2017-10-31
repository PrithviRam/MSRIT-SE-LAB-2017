package yyy;
import java.util.Scanner;

public class course {
	String colname;
	student stu1=new student();
	public void register()
	{
		System.out.println("enter then course name \n");
		Scanner input = new Scanner(System.in);
		colname=input.next();
		System.out.println("\n department offer couse:" + colname);
		stu1.getinformation();
		System.out.println("\n student register to this couse:" + colname);

		
	}

}
