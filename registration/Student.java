package registration;



public class Student {

    
    public Student() {
    	System.out.println("i am student");
    }

  
    public String studentName[]={"akshatha","amrutha"};

   
    public String studentId;

    public String studentEmailId;


    public void dispStudent() {
        System.out.println("students name");
        for(int i=0;i<2;i++){
        	System.out.println(studentName[i]);
        }
    }

}