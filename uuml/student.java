package studentregister;

/**
 * 
 */
public class Student {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * 
     */
    public String[] StuName = {"aadhya","joey","lilly","Josh"};

    /**
     * 
     */
    public String Usn;

    /**
     * 
     */
    public String Address;

    /**
     * 
     */
    public String Gender;

    /**
     * 
     */
    public String DOB;

    /**
     * 
     */
    public String Email;

    /**
     * 
     */
    public String Mobile;

    /**
     * 
     */
   
    public void selectDept(String StudentID) {
        // TODO implement here
    }

    /**
     * @param Student ID
     */
    public void selectCourse ( String StudentID) {
        // TODO implement here
    }

    /**
     * 
     */
    public void dropCourse() {
        // TODO implement here
    }

    /**
     * 
     */
public void withdrawCourse() {
        // TODO implement here
    }

    /**
     * 
     */
    public void displayStudent() {
        
    	System.out.println("Students registered for the course SE :");
    	for(int i=0 ; i <5; i++)
    	{
    		System.out.println(StuName[i]);
    	}
    } 

}