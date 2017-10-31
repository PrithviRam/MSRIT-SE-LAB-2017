package yyy;
import java.util.Scanner;

public class college {
	String colname;
	department dep1 = new department();
	
	public void getcollegeinfo()
	{
		System.out.println("enter the college name: ");
		Scanner input=new Scanner(System.in);
		colname=input.next();
		dep1.display();
		System.out.println("\n college has department:" + dep1.depname);
	    
	}

}
