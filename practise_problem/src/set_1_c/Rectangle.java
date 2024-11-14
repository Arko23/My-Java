package set_1_c;

import java.security.PublicKey;

public class Rectangle {
    double length, width, perimeter, area;
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double calculateArea()
    {
        double area=length * width;
        return area;
    }
    public double calculatePerimeter()
    {
        double perimeter=(2*length)+(2*width);
        return perimeter;
    }
}
