package register;
/**
 * 
 */
public class Course {

    /**
     * Default constructor
     */
    public Course() {
    }

    /**
     * 
     */
    public String coursecode;

    /**
     * 
     */
    public String title;

    /**
     * 
     */
    public Integer credit;

    
    public String instructor;



    /**
     * @param coursecode
     */
    public void createcourse(String coursecode) {
        // TODO implement here
    }

    /**
     * @param coursecode
     */
    public void getcourseinfo(String coursecode) {
        // TODO implement here
    }
    public void displayc() {
    	
    	Faculty f1 = new Faculty();
    	f1.displayF1();

    	Student s = new Student();
    	s.displayS();
    	
        // TODO implement here
    }

    /**
     * @param coursecode
     */
    public void dropcourse(String coursecode) {
        // TODO implement here
    }

}