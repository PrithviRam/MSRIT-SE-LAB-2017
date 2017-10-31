
package std;

import java.util.Scanner;

public class Department {
	public String dname;
	
	
	Faculty f1 = new Faculty();
	public void info() {
		System.out.println("Enter the department name \n");
		Scanner input=new Scanner(System.in);
        dname=input.next();
        f1.getdata2();
	
		
	}

}