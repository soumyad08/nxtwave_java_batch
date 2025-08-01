class Animal{
    void bark(){
        System.out.println(" Whole animal can bark ");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println(" No, We the dog bark correct way! ");
    }
}

class Cat extends Animal{
    void bark(){
        System.out.println(" We cat are perfect in bark :) ");
    }
}

public class Oops{
    public static void main(String args[]){
        Animal aD = new Dog();
        Animal ac = new Animal();

        aD.bark();
        ac.bark();
    }
}