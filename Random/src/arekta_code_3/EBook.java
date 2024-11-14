package arekta_code_3;

public class EBook extends Book {
    public String format;
    public EBook()
    {

    }

    public EBook(int chapters,int pages,String format)
    {
        super(chapters,pages);
        this.format=format;
    }

    @Override
    public void printSummary()
    {
        System.out.println("Ebook er maal");
        super.printSummary();
        System.out.println("format : "+format);
    }
}
