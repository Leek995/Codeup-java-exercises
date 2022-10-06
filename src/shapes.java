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

    public static void main(String[] args){
        Shapes Rectangle = new Shapes(3,5);
    }

    class Square extends Rectangle {
        int side;

        public Square(int length, int width, int side) {
            super(width, length);
            this.side = side;
        }

//    }public int getArea(){
//        this.side = this.length + width;
//    }
    }

}

