package register;


/**
 * 
 */
public class Faculty {

    /**
     * Default constructor
     */
    public Faculty() {
    }

    /**
     * 
     */
    public String[] facultyname = {"ravi","madhav","mukul","nithin","ram"};

    /**
     * 
     */
    public String facultyid;



    /**
     * 
     */
    public void displayF() {
        // TODO implement here
    	System.out.println("ISE consist of following Faculty");
    	for(int index=0 ; index < 5; index++)
    	{
    		System.out.println(facultyname[index]);
    	}

    }
    public void displayF1()
    {
    	System.out.println(" Faculty enrolled for the course");
    	System.out.println(facultyname[3]);
    	
    }

}