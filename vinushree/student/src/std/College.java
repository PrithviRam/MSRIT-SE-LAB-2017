package std;

import java.util.Scanner;

public class College {
	String clgname,clgcode ;
	Department d1 = new Department();
	public void display()
	{
		System.out.println("Enter the college name: ");
		Scanner input = new Scanner(System.in);
		clgcode = input.next();
		System.out.println("Enter the college code: ");
		Scanner input1 = new Scanner(System.in);
		clgcode = input1.next();
		d1.info();
		System.out.println("\n college has department:" + d1.dname  );
		
	}
	
}
