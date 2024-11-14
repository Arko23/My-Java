import java.util.Scanner;

public class Aray_3d
{
    public static void main(String[]args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("total matrixes = ");
        int a= ab.nextInt();
        System.out.println("rows = ");
        int b= ab.nextInt();
        System.out.println("coloumns = ");
        int c= ab.nextInt();
        System.out.println("input of matrixes = ");
        int[][][]arr=new int[a][b][c];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    arr[i][j][k]=ab.nextInt();
                }
            }
        }
        System.out.println("#3D array is = ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println("");
            }
            System.out.println("********");
        }

    }

}
