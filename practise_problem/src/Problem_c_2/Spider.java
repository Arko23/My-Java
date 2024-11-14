package Problem_c_2;

public class Spider extends Animal{
    Spider(int legs)
    {
        super(legs);
    }

    @Override
    void eat() {
        System.out.println("eats pokamakor");
    }
}
