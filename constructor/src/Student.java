public class Student {
    int id;
    String name;
    double cg;

    Student(int id,String name,double cg)//constructor
    {
        this.id=id;
        this.name=name;
        this.cg=cg;
    }
    Student()//constructor with empty block
    {
        System.out.println("error606");
    }
    void display()
    {
        System.out.println("id "+id);
        System.out.println("name "+name);
        System.out.println("cgpa "+cg);
    }

}
