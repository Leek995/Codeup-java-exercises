package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected length;
    protected width;
    public Quadrilateral(double length, double width) {
        super(length, width);
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

}
