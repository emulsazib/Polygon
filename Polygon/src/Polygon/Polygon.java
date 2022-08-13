package Playgon;

public abstract class Polygon {
    private int numSide;

    public Polygon(){
        this.numSide=0;
    }
    public Polygon(int numSide){
        this.numSide=numSide;
    }

    public int getNumSide() {
        return numSide;
    }

    public void setNumSide(int numSide) {
        this.numSide = numSide;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
