package registration;



public class Course {

    
    public Course() {
    	System.out.println("course offered are");
    }

    public String courseName[]={"atse","sadp","esd","cc"};

    public String courseId;
    public Student st;
    public Faculty f;

    public void dispCourse() {
    	for(int i=0;i<4;i++){
    		System.out.println(courseName[i]);
    	}
        st=new Student();
        st.dispStudent();
    }
void offered(){
	System.out.println(st.studentName[0]+" choosed course "+courseName[0]);
}

    }

