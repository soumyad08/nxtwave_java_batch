class Vechile{
    private String company;
    private int speed;

    public Vechile(String company, int speed){
        this.company=company;
        this.speed=speed;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void start(){
        System.out.println("Vechile is starting");
    }
}
class Car extends Vechile{
    private String fueltype;
    public Car(String company, int speed, String fueltype){
        super(company, speed);
        this.fueltype=fueltype;
    }
    @Override
    public void start(){
        System.out.println("car is starting");
    }
}
abstract class Mechanic{
    public abstract void service(Vechile Vechile);
    public void greet(){
        System.out.println("abstract public greet");
    }
}
class CarMechanic extends Mechanic{
    @java.lang.Override
    public void service(Vechile Vechile) {
        System.out.println("override carmechanic");
    }
}


public class oopsdemo{
    public static void main(String[] args){
        Car MyCar=new Car("toyoto", 120, "castrol");
        MyCar.start();
    }

}
