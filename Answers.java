public class Answers {

    //1. Write a program to print "Hello World!".
    public static int add(int a, int b) {
        return a + b;
    }

    //2. Write a program to check whether the number is even or, odd.
    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
    //3. Write a program to find factorial of a number.
    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    //4. Write a program to find maximum of two number.
    public static int maxOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("sum: " + add(5, 10));
        System.out.println("even or odd: " + evenOrOdd(7));
        System.out.println("factorial: " + factorial(5));
        System.out.println("max of two: " + maxOfTwo(10, 20));
    }
    
}