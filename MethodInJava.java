public class MethodInJava {

    public static int sum(int val1 , int val2){
        int totalSumofValue = val1 + val2;
        System.out.println(" addition of total values are: " + totalSumofValue);
        return totalSumofValue;
    }

    public static void main(String[] args) {
        int val1 = 20;
        int val2 = 30;
        int totalSum = sum(val1 , val2);
    }
}