public class Satish_Answer{
    public static void main(String[] arr){
        // Sum of two numbers
        int a = 5;
        int b = 6;
        System.out.println("Sum of two nums: " + a+b);

        //Even or odd
        int c = 5;
        if(c%2 == 0){
            System.out.println("Given number is Even");
        }else{
            System.out.println("Given number is Odd");
        }

        // area of circle
        int r = 10;
        double pi = 3.14;
        double area = pi*r*r;
        System.out.println("area of circle: " + area);

        //max of two nums
        int n = 5;
        int m = 10;
        if(n>m){
            System.out.println(n + " is greater than " + m);
        }else{
            System.out.println(m + " is greater than " + n);
        }
    }
}