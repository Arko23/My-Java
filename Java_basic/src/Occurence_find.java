import java.util.Scanner;

public class Occurence_find
{
    public static void main(String[]args)
    {
        int n,count=0;
        int digit_find;
        Scanner oc=new Scanner(System.in);
        System.out.println("enter the size of the array = ");
        n=oc.nextInt();
        System.out.println("enter random input in the array = ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=oc.nextInt();
        }
        System.out.println("enter a digit which you want to find at array = ");
        digit_find=oc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==digit_find) {
                count++;
            }
        }
        if(count!=0)
        {

            System.out.println("The occerance of the array is = "+count);
        }
        else {
            System.out.println("The digit you want to find is not in the array");
        }



    }
}
