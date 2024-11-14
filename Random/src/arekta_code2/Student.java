package arekta_code2;

public class Student {
    public static void main(String[]args)
    {
        Address address=new Address();
        address.city="Dhaka";
        address.postCode=1200;

        Person p=new Person();
        p.setName("Arko");
        p.setAge(23);

        System.out.println(address.city);
        System.out.println(address.postCode);
        String name=p.getName();
        System.out.println(name);
        int age=p.getAge();
        System.out.println(age);

    }
}
