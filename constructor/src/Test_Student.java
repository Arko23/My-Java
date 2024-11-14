import java.util.Scanner;

public class Test_Student {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int id=ob.nextInt();
        String name=ob.next();
        double cg=ob.nextDouble();

        Student s1=new Student(id,name,cg);
        s1.display();
        System.out.println("");
        Student s2=new Student();
        s2.display();
    }
}
