import java.util.Scanner;

public class TestEmp {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of your array= ");
        int n=ob.nextInt();
        Employe[] emp=new Employe[n];
        for(int i=0;i<emp.length;i++)
        {
            System.out.print("Enter the employee id= ");
            int id=ob.nextInt();
            System.out.print("Enter the employee age= ");
            int age=ob.nextInt();
            ob.nextLine();
            System.out.print("Enter the employee name= ");
            String name=ob.nextLine();
            System.out.println("Enter the sallery of employee= ");
            double sallery=ob.nextDouble();

            emp[i]=new Employe(id,age,name,sallery);
        }
        System.out.println("""
                Employe info : """);
        for(Employe x: emp)
        {
            System.out.print("Id = "+x.id);
            System.out.println("Age = "+x.age);
            System.out.println("Name = "+x.name);
            System.out.println("Sallery = "+x.sallery);
        }
    }
}
