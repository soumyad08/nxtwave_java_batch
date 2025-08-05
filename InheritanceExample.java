class Person{
    String name;

    void showName(){
        System.out.println(" My Name is " + name);
    }
}

class Student extends Person{
    int rollNo;

    void showRoll(){
        System.out.println(" My Roll is " + rollNo);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Meghna + Shalini + Sateesh + Shanmuk + Prkhayta + Laxmi Prasad";
        st.rollNo = 24;

        st.showRoll();
        st.showName();
    }
}