import java.util.Scanner;

public class sumof_digits {
    public static void main(String[]args){
        int n,temp,rem;
        int sum=0;
        try (Scanner find = new Scanner(System.in)) {
            System.out.println("enter a number= ");
            n=find.nextInt();
        }
        temp=n;

        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+rem;
            temp=temp/10;

        }
        System.out.println("sum of each digit in a number is = "+ sum +" done");


    }
}
