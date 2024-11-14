public class Student {
    int id;
    String name;
    double cgpa;
    void input(int id,String name,double cgpa)//instance
    {
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    void method()//normal method
    {
        System.out.println("Id= "+id);
        System.out.println("Name= "+name);
        System.out.println("Grade= "+cgpa);
    }
}
