
public class Oops {
    public static void main(String[] args){
        Student a=new Student();
        Car c=new Car("2A","RR",2024);
        Book b=new Book("Novel","Babu",100);
        Book bb=new Book("FightClub","David fincher",1000);
        Vehicle v;
        v=new Car1();
        v.startEngine();
        v=new Bike();
        v.startEngine();
        v=new Truck();
        v.startEngine();
        System.out.println(a.getMarks("1234"));
        System.out.println(a.getName("1234"));
        System.out.println(a.getRollNumber("1234"));
        c.displayCarDetails();
        b.displayBookDetails();
        bb.displayBookDetails();

    }
}
class Student{
    private int rollNumber=1;
    private String name="Advaith";
    private double marks=100.00;
    private String key="1234";
    public int getRollNumber(String a){
        if (a==key){
            return rollNumber;
        }
        return -1;
    }
    public String getName(String a){
        if (a==key){
            return name;
        }
        return "none";
    }
    public double getMarks(String a){
        if (a==key){
            return marks;
        }
        return -1.0;
    }

    public void setRollNumber(int rollNumber,String a) {
        if (a==key){
            this.rollNumber = rollNumber;

        }
    }

    public void setName(String name,String a) {
        if (a==key){
            this.name = name;

        }
    }
    void setMarks(double marks,String a) {
        if (a==key){
            this.marks = marks;

        }
    }
}
class Car{
    public String brand;
    public String model;
    public int date;
    public Car(String brand,String model,int date){
        this.brand=brand;
        this.model=model;
        this.date=date;
    }
    public void displayCarDetails(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(date);
    }
}

class Book{
    public String title;
    public String author;
    public int price;
    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayBookDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
}
class HelloWorld{
public void sayHello(){
        System.out.println("Hello World");
    }
}
class Vehicle{
    void startEngine(){
        System.out.println("this is a vehical");
    }
}
class Car1 extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Car has Started");
    }

}
class Bike extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Bike has Started");
    }

}
class Truck extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Truck has Started");
    }
}