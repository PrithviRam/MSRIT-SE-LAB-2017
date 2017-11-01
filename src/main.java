+package college;
 +
 +public class main {
 +
 +	public static void main(String[] args) 
 +	{
 +	college c1 = new college();
 +	course s1 = new course();
 +	System.out.println(" WELCOME TO COURSE REGISTRATION \n");
 +	c1.getcollegedetails();
 +	s1.register();
 +	System.out.println("\n REGISTRATION SUCCESFULL \n");
 +	System.out.println(" \n THANK U FOR REGISTRATION \n");
 +	}
 +
 +}