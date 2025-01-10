package lv.rvt;

public class Box {

    private double width;
    private double height;
    private double length;

    Box ( double width, double height, double length ){
        width=this.width;
        height=this.height;
        length=this.length;
    }

    double volume(){
        return width*height*length;
    }

    double area(){
      return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;              
    }

    private double faceArea(){
        return height*width;
    }

    private double topArea(){
        return height*width;
    }

    private double sideArea(){
        return height*width;
    }
}
