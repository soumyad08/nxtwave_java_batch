class Student{
    private String rollno;
    private String name;
    private int marks;
    public Student(String rollno, String name, int marks){
        this.rollno=rollno;
        this.marks=marks;
        this.name=name;
    }
    public void getdetails(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll no: "+rollno);
        System.out.println("Student Marks: "+marks);
    }
    public void sayHello(){
        System.out.println("hello my name is "+name);
    }

}
class Company {
    static String companyName = "Nxtwave";
    private String employeeName;
    public Company(String employeeName){
        this.employeeName=employeeName;
    }

    public void display() {
        System.out.println(employeeName + " works at " + companyName);
    }
}
class Employee{
    private String EmployeeName;
    private String EmployeeId;
    private String EmployeeRole;
    public Employee(String EmployeeName, String EmployeeId, String EmployeeRole){
        this.EmployeeName=EmployeeName;
        this.EmployeeId=EmployeeId;
        this.EmployeeRole=EmployeeRole;
    }
    public void getdetails(){
        System.out.println("Employee Name :"+EmployeeName);
        System.out.println("Employee Id :"+EmployeeId);
        System.out.println("Employee Role :"+EmployeeRole);
    }
}
class Car{
    private String Brand;
    private String Model;
    private int year;
    public Car(String Brand, String Model, int year){
        this.Brand=Brand;
        this.Model=Model;
        this.year=year;
    }
    public void getdetails(){
        System.out.println("Car Brand: "+Brand);
        System.out.println("Car Model: "+Model);
        System.out.println("Car Year: "+year);
    }
    public void drive() {
        System.out.println("Car is driving...");
    }
}
class Book{
    private String Title;
    private String Author;
    private int Price;
    public Book(String Title, String Author, int Price){
        this.Title=Title;
        this.Author=Author;
        this.Price=Price;
    }
    public void getdetails(){
        System.out.println("Book Title: "+Title);
        System.out.println("Book Author: "+Author);
        System.out.println("Book Price: "+Price);
    }
    public void setTitle(String title){
        Title=title;
        System.out.println("title changed");
    }
    public void printtitle() {
        System.out.println("Book title:" + Title);
    }

}
class Helloworld{
    public void sayhello(){
        System.out.println("Hello World");
    }
}
class Vechiles{
    public void startengine(){
        System.out.println("Vechile engine start");
    }
}
class Bike extends Vechiles{
    @Override
    public void startengine() {
        System.out.println("Bike engine starts");
    }
}
class Cars extends Vechiles{
    @Override
    public void startengine() {
        System.out.println("car enegine starts");
    }
}
class Truck extends Vechiles{
    @Override
    public void startengine() {
        System.out.println("Truck engine starts");
    }
}


public class Oopsprgraming{
    public static void main(String[] args){
        Student student1=new Student("N24H01B0035", "Rajasekhar", 75);
        student1.getdetails();
        Car Car1=new Car("toyata", "1c2", 2025);
        Car1.getdetails();
        Book book1=new Book("bahubali", "vijayendra prasad", 200);
        book1.getdetails();
        Vechiles v1=new Vechiles();
        v1.startengine();
        Cars c1=new Cars();
        c1.startengine();
        Bike b1=new Bike();
        b1.startengine();
        Truck t1=new Truck();
        t1.startengine();
        Employee e1=new Employee("Ram", "IB5", "web devoloper");
        Employee e2=new Employee("Ramu", "IB6", "web designer");
        e1.getdetails();
        e2.getdetails();
        Company c11=new Company("ram");
        c11.display();
        student1.sayHello();
        Car1.drive();
        book1.setTitle("new name");
        book1.printtitle();
    }

}
