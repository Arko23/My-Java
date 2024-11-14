package arekta_code2;

public class Person {
    private String name;
    private int age;
    private Address address;

    public void setName(String name)
    {
        this.name=name;
       // return name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age=age;
       // return age;
    }
    public int getAge()
    {
        return age;
    }

    Person()
    {
        name="Tamim Iqbal";
        age=35;
        address=new Address();
        address.postCode=1200;
        address.city="Dhaka";
    }
}
