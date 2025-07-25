public class Answers{
    static int addnums(int a, int b){
        return a+b;
    }
    static void evenorodd(int a){
        if(a%2 == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
    static float areaofcircle(int a){
        return (22/7*a*a);
    }
    static int maxnumber(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println(addnums(7,7));
        evenorodd(5);
        System.out.println(areaofcircle(6));
        System.out.println(maxnumber(6,9));
    }
}