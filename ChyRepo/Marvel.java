public interface Abc{
    public int a();
    public String b();
}
public class Marvel extends Abc{
    public Marvel(){
        this.name="deadpool";
        this.universe=616;
    }
    public int a(){
        System.out.println();
        return 1;
    }
    public static void main(String[] arg){
        System.out.println("Bring me thanos!!");
    }
}