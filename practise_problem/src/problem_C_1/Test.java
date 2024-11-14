package problem_C_1;

public class Test {
    public static void main(String[]args)
    {
        Shape ref;
        ref=new Rectangle(10,20);
        ref.pritArea();
        ref=new Triangle(30,50);
        ref.pritArea();
        ref=new Circle(20);
        ref.pritArea();

    }
}
