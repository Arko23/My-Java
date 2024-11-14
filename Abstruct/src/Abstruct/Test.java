package Abstruct;

public class Test {
    public static void main(String[]args)
    {
        //ABS er OBJ create kora jay na
        //So, Person Class er ekta ref var create korlam then
        //ei ref var or ref obj diye subclass er methods ke call kora jay
        Person ob;
        ob=new Student_1();
        ob.Display();//ref var diye display ke call krlam jehetu eta stu1 class e eshe porse hide obosthay ase
        ob.Show();
        ob=new Student_2();
        ob.Display();
        ob.Show();
    }
}
