package arekta_code_3;

public class Test {
    public static void main(String[]args)
    {
        EBook java=new EBook();
        int chapters=35;
        int pages=500;
        EBook c=new EBook(chapters,pages,"pdf");
        Book b=java;
        b.printSummary();
        b=c;
        b.printSummary();

    }
}
