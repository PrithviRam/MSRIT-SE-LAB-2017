package std;

public class Course {
	String Course_name;
	String Course_id;
	int no_credits;
	Student s = new Student();
	void display()
	{
		System.out.println("Details of different Courses");
		s.display();
	}
}