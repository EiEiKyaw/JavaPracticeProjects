package Overloading;

public class Overriding {
    public static void main(String[] args) {
        Add r1 = new Add();
        Multiple r2 = new Multiple();
        Add r3 = new Multiple();

        System.out.println(r1.result(3, 5, 10));
        System.out.println(r2.result(3, 5, 10));
        System.out.println(r3.result(3, 5, 10));
        System.out.println(r3.result(3, 5, 10));
    }
}

class Add{
    public Number result(int a, int b, int c){
        return a + b + c;
    }
}

class Multiple extends Add{
    @Override
    public Integer result(int a, int b, int c) {
        return a * b * c;
    }
}