public class Student{
    private String name;
    private int rollno;
    private double marks;

    // Constructor
    public Student(String name, int rollno, double marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }


    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Method to display Student Info
    public void displayInfoOfStudent(){
        System.out.println(" The Name of Topper Student is : " + name);
        System.out.println(" The marks of student is : " + marks);
        System.out.println(" The roll number of his/her is :" + rollno);
    }
}