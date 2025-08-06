public class LoopStatement {
    public static void main(String[] args) {
        //String[] names = {"Soumya", "Prakhyat", "Sateesh"};
        int i = 0;
        while(i <= 10){
            if(i == 6){
                i++;
                continue;
            }
            System.out.println(i);
           i++;
        }
    }
}