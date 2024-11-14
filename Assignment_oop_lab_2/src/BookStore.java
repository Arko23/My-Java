import java.util.Scanner;

public class BookStore {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int n=100,i=0;
        Book[] books=new Book[n];

        while(true) {
            System.out.print("input a character from user from input a,input q,input p");
            System.out.print("Your choice is = ");
            char c = ob.nextLine().charAt(0);
            if (c == 'a' || c == 'A')
            {
                System.out.print("Book Name = ");
                String BookName = ob.nextLine();
                System.out.print("Book Pirce = ");
                double BookPrice = ob.nextDouble();
                books[i] = new Book(BookName, BookPrice);
                i = i + 1;
                ob.nextLine();
            }
            else if (c == 'p' || c == 'P')
            {
                for (int j = 0; j < i; j++)
                {
                    System.out.println("Book Name  : " + books[j].BookName);
                    System.out.println("Book Price : " + books[j].BookPrice);
                    System.out.println();
                }
            }
            else if (c == 'q' || c == 'Q')
            {
                break;
            }
            else
            {
                System.out.println("error606");
            }

        }

    }
}
