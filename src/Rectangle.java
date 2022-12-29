public class Rectangle {
    /**
     * Write a class that describes the fields and methods of a rectangle
     * Write another class that creates and instances of the rectangle class to the total are of two rooms in a house
     */

    private int length;
    private int width;

    public Rectangle(){};
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double calculateAre(){
        return length * width;
    }
    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }


}
