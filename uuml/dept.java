package studentregister;
	/**
	 * 
	 */
	public class Department {
	
	    /**
	     * Default constructor
	     */
	   
	    public String[] deptname = {"ISE","CSE"};
	   
	    /**
	     * 
	     */
	    public String Location;
	
	    public void addCourse() {
	        // TODO implement here
	    }
	
	    public void removeCourse() {
	        // TODO implement here
	    }
	
	    /**
	     * 
	     */
	    public void displayDept() {
	    	System.out.println("XYZ College consist of the following dept");
	    	for(int i=0 ; i <2 ; i++)
	    	{
	    		System.out.println(deptname[i]);
	    	}
	    	
	    	Faculty f = new Faculty();
	    	f.displayFaculty();
	    
	        
	    }
	
	}

