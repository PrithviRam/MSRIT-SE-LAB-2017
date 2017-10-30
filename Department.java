package register;
/**
 * 
 */
public class Department {

    /**
     * Default constructor
     */
    public Department() {
    }

    /**
     * 
     */
    public String[] departmentname = {"ISE","CSE","CIVIL","MECHANICAL","EC"};
   
    /**
     * 
     */
    public String facultyname;

    public void getfaculty() {
        // TODO implement here
    }

    public void getfacultylist() {
        // TODO implement here
    }

    /**
     * 
     */
    public void displayD() {
    	System.out.println("msrit consist of following dept");
    	for(int index=0 ; index < 5; index++)
    	{
    		System.out.println(departmentname[index]);
    	}
    	
    	Faculty f = new Faculty();
    	f.displayF();
    
        // TODO implement here
    }

}