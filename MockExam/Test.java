public class Test {
    public static void main(String[] args){
//        int a = 10;
//        int b = 20;
//        switch (a){
//            case 1:
//                System.out.println("It is 1");
//                break;
//            case 10:
//                System.out.println("it is 10");
//                break;
//            default:
//                System.out.println("None match");
//                break;
//        }
        String  p="Advaith";
        String alf="OPPS";
        char ch;
        alf=alf+p;
        System.out.println(alf);

        for (int i=0;i <p.length();i++){
            ch = p.charAt(i);

            alf = ch+alf;
        }
        System.out.println(alf);
    }
}