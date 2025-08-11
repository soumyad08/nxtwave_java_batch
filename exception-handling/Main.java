/*
*                       Exception
*              1. Checked Excp         2. Unchecked Exception
*
* Checked Exception:                        Unchecked Exceptions:
*           1. IOException                              1. ArithmaticException
*           2. SQLException                             2. NullPointerException
*           3. ClassNotFoundException                   3. IllegalArgumentException
*           4. ParseExceptiom                           4. ClassCastException
*                                                       5. IndexOutOfBoundException ---
*                                                                                1. ArrayIndexOutOfBound
*                                                                                2. StringIndexOutOfBound
* */
import java.lang.*;

public class Main {
//    public static void main(String[] args) throws ClassNotFoundException{
////        method1();
//        int [] val = new int [2];
//        try{
//            System.out.println(" Access Element there: " + val[3]);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(" Exception here " + e);
//        }finally {
//            val[0] = 6;
//            System.out.println("First element I am getting " + val[0]);
//            System.out.println(" Here is my finally block ");
//        }
//    }

//    private static void method1() throws ClassNotFoundException{
//        try {
//            throw new ClassNotFoundException();
//        }catch(ClassNotFoundException exp){
//            exp.printStackTrace();
//        }
//    }
//
//    private void method2(){
//        method3();
//    }
//
//    private void method3() {
//        try {
//            int b = 5 / 0;
//        }catch (ArithmeticException e){
//            System.out.println(" Canont divide By Zero ");
//        }
//    }
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawalAmount = 6000;

        try {
            System.out.println("Attempting to withdraw ₹" + withdrawalAmount);
            if (withdrawalAmount > balance) {
                throw new IllegalArgumentException("Insufficient balance.");
            }
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
        } catch (IllegalArgumentException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            System.out.println("Transaction logged. (This always runs)");
        }
    }
}