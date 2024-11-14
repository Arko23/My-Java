package arr_obj_with_hiighest;

import java.util.Scanner;

public class Test {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter array size= ");
        int size=ob.nextInt();
        Student[] stu=new Student[size];
        for(int i=0;i< stu.length;i++)
        {
            System.out.println("Student"+i+" id= ");
            int id=ob.nextInt();
            System.out.println("Student"+i+"age= ");
            int age=ob.nextInt();
            ob.nextLine();
            System.out.println("Student"+i+"name= ");
            String name=ob.nextLine();
            System.out.println("Student"+i+"Grade= ");
            double cg= ob.nextDouble();
            stu[i]=new Student(id,age,name, cg);
        }
        System.out.println("""
                Student info: """);
        for(Student x:stu)
        {
            System.out.println("Students id"+x.id);
            System.out.println("Students age"+x.age);
            System.out.println("Studetns name"+x.name);
            System.out.println("Students grade"+x.cg);
        }
        int max=0;
        for(int i=1;i< stu.length;i++)
        {
            if (stu[max].cg<stu[i].cg)
            {
                max=i;
            }
        }
        System.out.println("");
        System.out.println("*********");
        System.out.println("Id of the highest Graded Student= "+stu[max].id+"\n"+"Age of the highest Student= "+stu[max].age+"\n"+"Name of the highest Student= "+stu[max].name+"\n"+"Grade of the highest Student"+stu[max].cg);
    }
}
