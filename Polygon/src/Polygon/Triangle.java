package Playgon;

public class Triangle extends Polygon{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(){
        this.sideA=0;
        this.sideB=0;
        this.sideC=0;
    }



    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(int numSide, double sideA, double sideB, double sideC) {
        super(numSide);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {

        return sideB;
    }

    public void setSideB(double sideB) {

        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return 0.5*this.sideB*(0.5*Math.sqrt(((this.sideA+this.sideB+this.sideC)*(-this.sideA+this.sideB+this.sideC)*(this.sideA-this.sideB+this.sideC)*(this.sideA+this.sideB-this.sideC))/this.sideB));
    }

    @Override
    public double getPerimeter() {
        return this.sideA+this.sideB+this.sideC;
    }
}
