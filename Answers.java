public class Answers {

    public static void main(String[] args) {

        // 1. Write a program to add any two nums.
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum = " + sum);

        // 2. Write a program to check whether the number is even or odd.
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // 3. Write a program to calculate the area of circle.
        double radius = 5.0;
        double area = 3.14159 * radius * radius;
        System.out.println("Area of circle = " + area);

        // 4. Write a program to find maximum of two number.
        int x = 15;
        int y = 25;
        if (x > y) {
            System.out.println("Maximum is " + x);
        } else {
            System.out.println("Maximum is " + y);
        }
    }
}
