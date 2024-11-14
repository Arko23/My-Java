import java.sql.SQLOutput;
import java.util.Scanner;

public class max_min {
    public static void main(String[]args){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("size of array = ");
        n=in.nextInt();
        System.out.println("take random numbers = ");
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        int m1=arr[0];   //maximum=m1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>m1)
            {
                m1=arr[i];
            }
        }
        System.out.println("max value in array = "+m1);
        int m2=arr[0];   //minimum=m2;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<m2)
            {
                m2=arr[i];
            }
        }
        System.out.println("min value in array = "+m2);


    }
}
