import java.util.Scanner;

public class Test_Superman {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        String name= ob.next();
        String power=ob.next();

        Superman s=new Superman(name,power);
        s.display();


    }
}
