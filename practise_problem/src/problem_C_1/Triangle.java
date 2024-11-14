package problem_C_1;

public class Triangle extends Shape{
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    void pritArea() {
        double result=0.5*dim1*dim2;
        System.out.println("Area: "+result);
    }
}
