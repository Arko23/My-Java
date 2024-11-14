package set_1;

import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length= ");
        int l=ob.nextInt();
        System.out.println("enter width= ");
        int w= ob.nextInt();
        System.out.println("enter height= ");
        int h= ob.nextInt();

        Box a=new Box(l,w,h);
        //a.Getvoulume();
        double vol=a.Getvoulume();
        System.out.println("volume of the box = "+vol);


    }
}
