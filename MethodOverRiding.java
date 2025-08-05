class Person{
    void introduce(){
        System.out.println(" I am Soumyadeep, a teacher");
    }
}

class Student extends Person{
    void introduce(){
        System.out.println(" I am a Instructor ");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Person p = new Student();
        p.introduce();
    }
}