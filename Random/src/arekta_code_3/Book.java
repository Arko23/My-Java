package arekta_code_3;

public class Book {
    public int chapters;
    public int pages;
    public Book(int chapters,int pages)
    {
        this.chapters=chapters;
        this.pages=pages;
    }

    public Book() {
    }

    public void printSummary()
    {
        System.out.println("Book er maal");
        System.out.println("Chapters : "+chapters);
        System.out.println("Pages :"+pages);
    }
}
