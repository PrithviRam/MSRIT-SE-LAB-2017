+package college;
 +
 +import java.util.Scanner;
 +
 +public class college {
 +	String cname ;
 +	department d1 = new department();
 +	public void getcollegedetails()
 +	{
 +		System.out.println("Enter the college name: ");
 +		Scanner input = new Scanner(System.in);
 +		cname = input.next();
 +		d1.display();
 +		System.out.println("\n college has department:" + d1.dname  );
 +	}
 +	
 +}