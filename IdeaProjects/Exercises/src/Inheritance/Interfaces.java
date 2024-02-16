package Inheritance;

public class Interfaces {
    public static void main(String[] args) {
        Me m = new Me();
        m.legacy1();
        m.legacy2();
    }
}

interface Grandma{
    void legacy1();
}

interface Mom{
    void legacy2();
}

class Me implements Grandma, Mom{
    public void legacy1(){
        System.out.println("My grandma gives me the mysterious diamond.");
    }
    public void legacy2(){
        System.out.println("My Mom also gives me the unique knowledge and wisdom.");
    }
}
