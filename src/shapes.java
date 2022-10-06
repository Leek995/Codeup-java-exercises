import java.awt.*;

class Shapes {
    protected int length;
    protected int width;

    public Shapes(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getPerimeter(){
        return (this.length * 2) + (this.width * 2);
    }
    public  int getArea(){
        return this.length * this.width;
    }

    public static void main(String[] args){
        Shapes Rectangle = new Shapes(3,5);
        Shapes Square = new Shapes(4,4);
        System.out.println(Square.getPerimeter());
        Rectangle box1 = new Rectangle(5,4);
        box1.getArea();
        box1.getPerimeter();

    }
    static class Rectangle extends Shapes{
        public Rectangle(int length, int width) {
            super(length, width);
        }

        @Override
        public int getPerimeter() {
            return super.getPerimeter();
        }
    }
    class Square extends Shapes {
        int side;

        public Square(int length, int width, int side) {
            super(length, width);
            this.side = side;
        }

        @Override
        public int getPerimeter() {
            length = side;
            width = side;
            return (length * 2) + width * 2;
        }
        //    }public int getArea(){
//        this.side = this.length + width;
//    }
    }

}

