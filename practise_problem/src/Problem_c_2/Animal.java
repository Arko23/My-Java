package Problem_c_2;
 /* 2. Create the Animal class, which is the abstract superclass of all animals. [5]
            • Declare a public integer attribute called legs, which records the number of legs for this
              animal.
            • Define a public constructor that initializes the legs attribute.
            • Declare an abstract method eat.
            • Declare a concrete method walk that prints out something about how the animals walk
            (include the number of legs).
    Create the Spider class that extends the Animal class. Define a default constructor that
    calls the superclass constructor to specify that all spiders have eight legs. Implement the
    eat method.*/


public abstract class Animal {
    int legs;
    public Animal(int legs)
    {
        this.legs=legs;
    }
    abstract void eat();
    void Walk()
    {
        System.out.println("Animal walks with "+legs+" legs");
    }


}
