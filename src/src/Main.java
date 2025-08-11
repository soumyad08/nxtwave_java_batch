public class Main{
    public static void main(String[] args){
        int a = 20;
        int b = 40;

        // 1. write a program to add any two nums.

        System.out.println("Addition of two numbers : "+ (a+b));

        // 2. Write a program to check whether the number is even or, odd.

        if (a%2==0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given  number is odd");
        }

        // 3. Write a program to calculate the area of circle.

        int radius = 5;
        double pi = 3.14;
        double area = pi*radius*radius;
        System.out.println("Area of Circle : " + (area));

        // 4. Write a program to find maximum of two number.

        if (a>b){
            System.out.println("Maximum Number is : " +(a));
        }
        else{
            System.out.println("Maximum Number is : " +(b));
        }

    }
}