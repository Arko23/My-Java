import java.util.Scanner;

public class nth_number {
    public static void main(String[]args)
    {
         int n,temp,pos,count=0;
        System.out.println("Your number= ");
        Scanner nth=new Scanner(System.in);
        n=nth.nextInt();
        System.out.println("The position of your number = ");
        pos=nth.nextInt();
        temp=n;
        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }
        int[] np=new int[count];
        for(int i=count-1;i>=0;i--)
        {
            np[i]=n%10;
            n=n/10;

        }
        if(pos<=count)
        {
            System.out.println("Position- "+np[pos-1]);
        }
        else {

            System.out.println("Error202");
        }


    }
}