package registration;



public class Faculty {

   
    /*public Faculty() {
    	System.out.println("i am faculty of this department");
    }*/

   
    public String facName[]={"smitha","soumya"};

   
    public String facId;

    public Course c;



    
    public void dispFaculty() {
    	System.out.println("faculty names");
    	for(int i=0;i<2;i++){
        System.out.println(facName[i]);
    	}
    	
    }
    void handled(){
		//c.offered();
		System.out.println(c.courseName[0]+"handled by"+facName[0]);
	}
}