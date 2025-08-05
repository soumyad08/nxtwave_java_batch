/*
* Poly = many
* morphism = forms
*
* That means a same method behaves differently in different situations.
* Type of Polymorphism:
* 1. Compile Time Polymorphism which is also known as Method ovrloading.
* 2. Run Time Polymorphism which is also known as Method Overriding.
* */


public class PolymorphismExample {

    // Compile Time (Mehod Overloading)
    class Student{
        void showDetails(String name){
            System.out.println(" My name is " + name);
        }

        void showDetails(String name, int marks){
            System.out.println(" My name is " + name + " My math marks is: " + marks);
        }
    }
    public static void main(String[] args) {
       Student s = new Student();
       s.showDetails("Soumyadeep");
       s.showDetails("Soumyadeep", 88);
    }
}