public class Assess {
    public static void main(String[] args){
        Employeep e1=new Employeep("Advaith","Devops",18);
        Employeep e2=new Employeep("Chaitanya","Fullstack dev",18);
        e1.details();
        e2.details();
        Studentp s1=new Studentp("Chaitu");
        Studentp s2=new Studentp("Vishal");
        Company c=new Company("Advaith");
        Company c1=new Company("Chaitanya");
        c.companyName="OpenAI";
        c1.companyName="OpenAI";
        c.display();

        c1.display();
        c.companyName="p";
        c.display();
        c1.display();
    }
}
class Employeep{
    String name;
    String position;
    int age;

    Employeep(String name,String position,int age){
        this.name=name;
        this.position=position;
        this.age=age;

    }
    void details(){
        System.out.println("Employeep name:"+this.name);
        System.out.println("Employeep position:"+this.position);
        System.out.println("Employeep age:"+this.age);
    }
}
//2. Use this to call current class method
class Carp {
    void start() {
        System.out.println("Car is starting...");
        this.drive();
    }

    void drive() {
        System.out.println("Car is driving...");
    }
}
//3.Return current object using this:
class Bookp {
    String title;

    Bookp setTitle(String title) {
        // Set title using this and return current object
        this.title=title;
        return this;
    }

    void printTitle() {
        System.out.println("Title is: " + title);
    }
}
//4. Use new to create multiple objects in the main methods
class Studentp {
    String name;
    Studentp(String name){
        this.name=name;
    }

    void sayHello() {
        System.out.println("Hello, I am " + name);
    }
}
//5. Use static variable shared among all objects:
class Company {
    static String companyName = "Nxtwave";
    String employeeName;
    Company(String employeeName){
        this.employeeName=employeeName;
    }
    void display() {
        System.out.println(employeeName + " works at " + companyName);
    }
}
