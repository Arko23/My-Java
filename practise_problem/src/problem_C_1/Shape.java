package problem_C_1;
/*1. Create an abstract class named Shape that contains two instance variables “dim1” and “dim2” of
        integer type and an abstract method named printArea(). Develop classes named Rectangle,
        Triangle and Circle which will be the subclasses of Shape class. Override the printArea() method
        and prints the area of the given shape.*/
public abstract class Shape {
    double dim1,dim2;

    Shape(double dim1,double dim2)
    {
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract void pritArea();
}
