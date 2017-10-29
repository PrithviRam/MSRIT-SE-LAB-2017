
public class faculty extends dept {
	public String facultyName;

	public faculty(String deptname) {
		super(deptname);
		// TODO Auto-generated constructor stub
	facultyName="PMK";
	
	
	}
	

		  public static void main(String[] args) {
		    dept dept = new dept("information Science and engineering");
		    faculty facul = new faculty("PMK");
		    college coll =new college();

		    System.out.println("Department Name:" + dept);
		    System.out.println("FacultyName:"+ facul);
		   
		  }
		}
	

