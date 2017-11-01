package registration;



public class Department {

   
    public Department() {
    	System.out.println("welcome to department");
    }

   
    public String deptName[]={"ise","cse","ece"};

   
    public int deptStrength;
    
    public Faculty fac; 





    public void dispDepartment() {
    	System.out.println("different department list");
    	for(int i=0;i<3;i++){
    		
    		System.out.println(deptName[i]);
    	}
    	fac=new Faculty();
       fac.dispFaculty();
    }

}