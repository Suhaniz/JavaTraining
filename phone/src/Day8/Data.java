package Day8;

public class Data {
	int id;
	Student S1;
	public void display(int id,Student S1)
	{
		System.out.println("Student ID is: "+id);
		System.out.println("Student Name is: "+S1.name);
	}
    public static void main(String[] args) {
		Data d= new Data();
		Student S1=new Student("Suhani");
		d.id=10;
		d.display(d.id,S1);
	}
}
