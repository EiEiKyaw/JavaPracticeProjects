package TestEx;

public class CovariantTest {
    public static void main(String[] args) {
        System.out.println(new dateCal().toCal(15));
        System.out.println(new dateShow().toCal(15));



    }
}

class dateCal{
    public Integer toCal(int date){
        return date;
    }
}

class dateShow extends dateCal{
//    public String toCal(String date){
//        return date;
//    }

    @Override
    public String toCal(String date) {
        return String.valueOf(super.toCal(Integer.parseInt(date)));
    }
}
