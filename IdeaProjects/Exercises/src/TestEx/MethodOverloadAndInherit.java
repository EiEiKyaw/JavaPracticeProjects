package TestEx;

public class MethodOverloadAndInherit {
    public static void main(String[] args) {
        JohnLikes jl = new JohnLikes();
        jl.mostLikes("Tesla", "LV");
        jl.mostLikes("Tesla", "LV", "McDonald");
    }
}

class PeopleLikes{
    String clothes;
    String food;
    String car;
    protected void mostLikes(String clothes, String food, String car){
        this.clothes = clothes;
        this.food = food;
        this.car = car;
        System.out.printf("People like %s, %s and %s most.\n", this.clothes, this.food, this.car);
    }
}

class JohnLikes extends PeopleLikes{
   protected void mostLikes(String car, String clothes){
       super.mostLikes(car, clothes, null);
   }
   protected void mostLikes(String car, String clothes, String food){
       super.mostLikes(car, clothes, food);
   }
}
