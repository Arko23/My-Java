package problem_C_1;

public class Rectangle extends Shape{

    Rectangle(double dim1,double dim2)
    {
        super(dim1, dim2);
    }

    @Override
    void pritArea() {
        double result=dim1*dim2;
        System.out.println("Rectangle: "+result);
    }
}
