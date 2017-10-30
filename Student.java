package register;

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
    public String StudentID;

    /**
     * 
     */
    public String[] Name = {"a","b","c","d","e","f"};

    /**
     * 
     */
    public String Major;

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
    public String Address;

    /**
     * 
     */
    public String Contact;



    /**
     * @param Student ID
     */
    public void createstudent(String StudentID) {
        // TODO implement here
    }

    /**
     * @param Student ID
     */
    public void getstudentinfo ( String StudentID) {
        // TODO implement here
    }

    /**
     * 
     */
    public void getstudentusername() {
        // TODO implement here
    }

    /**
     * 
     */
    public void displayS() {
        // TODO implement here
    	System.out.println("student registered for the course");
    	for(int index=0 ; index < 6; index++)
    	{
    		System.out.println(Name[index]);
    	}
    }

}