package problem_C_1;

public class Circle extends Shape{
    public Circle(double r) {
        super(r,r);
    }

    @Override
    void pritArea() {

        double result=Math.PI*dim1*dim2;
        System.out.println("Circle: "+result);


    }
}
