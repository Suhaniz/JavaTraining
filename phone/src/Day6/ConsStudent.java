package Day6;

public class ConsStudent {
    // fields
    String name;
    int roll;
    int YOP; // Year of Passing

    // parameterized constructor
    public ConsStudent(String name, int roll, int passYear) {
        this.name = name;
        this.roll = roll;
        this.YOP = passYear;
    }

    // method to display student details
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Year of Passing : " + YOP);
    }

    // main method to test
    public static void main(String[] args) {
        ConsStudent s1 = new ConsStudent("Suhani", 66, 2024);
        s1.display();
    }
}
