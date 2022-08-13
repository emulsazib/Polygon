package Playgon;

public class Main {
    public static void main(String[] args) {
        Polygon p1;
        p1=new Triangle(3,5,6,7);
        System.out.println(p1.getArea());
        System.out.println(p1.getPerimeter());
    }
}
