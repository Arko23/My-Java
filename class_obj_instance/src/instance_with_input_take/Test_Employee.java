package instance_with_input_take;

import java.util.Scanner;

public class Test_Employee {
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
            System.out.println("id= ");
            int Id_m1 = ob.nextInt();
            int Id_m2 = ob.nextInt();
            System.out.println("name= ");
            String Name_m1 = ob.next();
            String Name_m2 = ob.next();
            System.out.println("Performance rate= ");
            double Performance_rate_m1 = ob.nextDouble();
            double Performance_rate_m2 = ob.nextDouble();

        Employee m1=new Employee();
        m1.input(Id_m1,Name_m1,Performance_rate_m1);
        m1.display();
        Employee m2=new Employee();
        m2.input(Id_m2,Name_m2,Performance_rate_m2);
        m2.display();
    }

}
