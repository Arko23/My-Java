package problem_set_1_b;

import java.util.Scanner;

public class Test {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("height = ");
        int height=ob.nextInt();
        System.out.print("length = ");
        int length=ob.nextInt();
        System.out.print("base = ");
        int base=ob.nextInt();
        System.out.print("radius = ");
        int radius=ob.nextInt();

        Shape abc=new Shape(height,length,base,radius);
        double vol1=abc.Area_of_rectangle();
        double vol2=abc.Area_of_circle();
        double vol3=abc.Area_of_triangle();
        double vol4=abc.Area_of_circle();

        System.out.println("Area_of_rectange = "+vol1);
        System.out.println("Area_of_circle = "+vol2);
        System.out.println("Area_of_triangle = "+vol3);
        System.out.println("Area_of_circle = "+vol4);
    }
}
