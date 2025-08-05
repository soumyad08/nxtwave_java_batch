// class Concept

//abstract class Student {
//    // Abstruction : hides internal complexity through interface and using
//    // abstruct classes.
//
//    abstract void study(); // abstract meethod
//
//    void attendClass(){
//        System.out.println(" You are attending my class");
//    }
//
//    static class FirstYearStudent extends Student{
//        void study(){
//            System.out.println(" Studing Java right now ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Student st = new FirstYearStudent();
//        st.study();
//        st.attendClass();
//    }
//}


// Encapsulation
/*
* Encapsulation wrap all the data varaible and methods together in a single unit.
* It also known as DATA-HIDING.
* to achieve encapsulation, we can declare variable of a class as private.
* To modification of this variable we can use public getter and setter methods.
* */

//public class Student {
//    private String name;
//
//    private int age;
//
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//}

/*
* Inheritance:
* In Inheritance, we can inherit the property from their super class or, parent class.
* It can inherit both functions and variables so that we don't need to write all of them again and again.
*
* to achieve inheritance we need to use extends keyword or, through interface.
* */

class Person{
    String name;

    void showName(){
        System.out.println(" my name is: " + name);
    }

    static class StudentNxt extends Person{
        int roll;
        void showRoll(){
            System.out.println(" My Roll no. is " + roll);
        }
    }

    public class Student{
        public static void main(String[] args) {
            StudentNxt st = new StudentNxt();
            st.name = "Soumya";
            st.roll = 24;

            st.showName();
            st.showRoll();
        }
    }
}
