package registration;



public class College {

   
    public College() {
    	System.out.println("welcome to college");
    }

   
    public String collegeName;

    
    public String collegeCode;

    
    public String collegeAddress;

    public Department dept;


    public void dispCollege() {
       dept=new Department();
       dept.dispDepartment();
    }

}