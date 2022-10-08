package shapes;

abstract public class Shape{
    protected double length;
    protected double width;
    public Shape(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(double length, double width){
        this.length = length;
        this.width = width;
        return length * width;
    }
    public double getPerimeter(double length, double width){
        this.width = width;
        this.length = length;
        return (length * 2) + (width * 2);
    }
}
