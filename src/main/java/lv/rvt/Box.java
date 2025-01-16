package lv.rvt;

public class Box {

    private double width;
    private double height;
    private double length;

    Box( double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box (Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    double volume(){
        return width*height*length;
    }

    double area(){
      return 2 * faceArea() + 2 * topArea() + 2 * sideArea();              
    }

    private double faceArea(){
        return height*width;
    }

    private double topArea(){
        return length*width;
    }

    private double sideArea(){
        return height*length;
    }

    public double length(){
        return length;
    }

    public double height(){
        return height;
    }

    public double width(){
        return width;
    }

    public Box biggerBox( Box oldBox ){
        return new Box( 1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    }

    public Box smallerBox( Box oldBox ){
        return new Box( 0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.length());
    }

    public boolean nests(Box outsideBox){
        if (this.width < outsideBox.width && this.height < outsideBox.height && this.length < outsideBox.length){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "Box with width: " + width + " height: " + height + " length: " + length;
    }
}
