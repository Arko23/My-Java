package set_1_c;

import java.util.Scanner;

public class Test {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("enter length= ");
        int length=ob.nextInt();
        System.out.print("enter width= ");
        int width=ob.nextInt();


        Rectangle r=new Rectangle(length,width);
        double v1=r.calculateArea();
        double v2=r.calculatePerimeter();

        System.out.println("The area of the rectangle is: "+v1);
        System.out.println("The perimeter of the rectangle is: "+v2);
    }

}
