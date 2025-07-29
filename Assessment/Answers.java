public class Answers {
    public int add(int a,int b){
        return  a+b;
    }
    public boolean iseven(int a){
        return a%2==0;
    }
    public double AreaOfCircle(int r){
        return (3.14*r*r);
    }
    public int max(int a,int b){
        return (a>b)?a:b;
    }
    public static void main(String[] args) {
        Answers ans = new Answers();

        System.out.println("Print adding: " + ans.add(7, 63));
        System.out.println("Print even check: " + ans.iseven(ans.add(7, 63)));
        System.out.println("Print area of circle: " + ans.AreaOfCircle(5));
        System.out.println("Printing max element: " + ans.max(8, 7));
    }
}