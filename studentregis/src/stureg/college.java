package stureg;

public class college {
	String name;
	String address;
	department d1 = new department();
	faculty f1 = new faculty();
void display()
{
	System.out.println("college has department");
	d1.display();
	f1.display();
	
}
}
