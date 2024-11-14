import java.util.Scanner;

public class Array_2D {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("row size - ");
        int n=ob.nextInt();
        System.out.println("coloum size- ");
        int n1= ob.nextInt();
        System.out.println("values - ");
        int[][]arr=new int[n][n1];
        for(int i=0;i<arr.length;i++)
        {
         for(int j=0;j<arr[i].length;j++)
         {
             arr[i][j]=ob.nextInt();
         }
        }
        System.out.println("your array is- ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
