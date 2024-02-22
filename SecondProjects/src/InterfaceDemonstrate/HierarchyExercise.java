package InterfaceDemonstrate;

interface Shapes{
    public double CalculateArea();
}

class Rectangles implements Shapes{
    private double length;
    private double width;
    public double area = 0;

    public Rectangles(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double CalculateArea() {
        area = length * width;
        return area;
    }
}

class Circles implements Shapes{
    private double radius;
    public double area = 0;

    public Circles(double radius) {
        this.radius = radius;
    }

    @Override
    public double CalculateArea() {
        area = Math.PI*Math.pow(radius, 2);
        return area;
    }
}

public class HierarchyExercise {

    public static void main(String[] args) {
        Rectangles rectangle1 = new Rectangles(5,7);
        System.out.println("Rectangle area: " + rectangle1.CalculateArea());

        Circles circle1 = new Circles(5);
        System.out.println("Circle area: " + circle1.CalculateArea());
    }
}
