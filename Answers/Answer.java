public class Answer{
    static int sum(int a,int b){
        return a+b;
    }

    static String check(int x){
        if (x%2==0){
            return "Even";
        }
        return "Odd";
    }
    static double area(int r){
        return r*2*3.14 ;
    }
    static int checkgreater(int m, int y){
        if (m>y){
            return m;
        }
        return y;
    }
    public static void main(String[] args){
        System.out.println(sum(3,5));
        System.out.println(check(4));
        System.out.println(area(5));
        System.out.println(checkgreater(3,5));
    }

}