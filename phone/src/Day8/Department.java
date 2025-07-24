package Day8;

public class Department {
    int dept_No;
    Student S1;
    public void display(int dept_No,Student S1)
    {
    	System.out.println("Dept_No is: "+dept_No);
    	System.out.println("Student Name is: "+S1.name);
    }
    public static void main(String[] args) {
		Department dt=new Department();
		Student S1=new Student("Suhani");
		dt.dept_No=101;
		dt.display(dt.dept_No, S1);
		
	}
}
