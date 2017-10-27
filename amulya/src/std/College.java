package std;

public class College {
	String College_name;
	int College_id;
	String College_address;
	Department d = new Department();
	Faculty f = new Faculty();
	void display()
	{
		System.out.println("College is MSRIT");
		d.display();
		f.display();
	}

}
