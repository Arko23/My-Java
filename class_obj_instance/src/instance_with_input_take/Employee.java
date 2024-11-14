package instance_with_input_take;

public class Employee {
    int Id;
    String Name;
    double Performace_rate;
    //Instance;
    void input(int Id,String Name,double Performance_rate)
    {
        this.Id=Id;
        this.Name=Name;
        this.Performace_rate=Performance_rate;
    }
    //normal method
    void display()
    {
        System.out.println("Id= "+Id);
        System.out.println("Name= "+Name);
        System.out.println("Performace Rate in decimal ="+Performace_rate);
    }
}
