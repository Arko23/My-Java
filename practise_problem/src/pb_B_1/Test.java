package pb_B_1;

import java.util.Scanner;

public class Test {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        Adress[]ad=new Adress[100];
        for(int i=0;i< ad.length;i++)
        {
            System.out.println("Welcome");
            System.out.println("I guess you are doing well");
            System.out.println("if your interested in our program then you can create your address here");
            System.out.println("""
                    
                    1.Create
                    2.Update
                    4.Display
                    4.Delete
                    """);
            System.out.print("options = ");
            int a=ob.nextInt();
            if(a==1)
            {
                System.out.println("Thanks for having the urge to create account");
                System.out.print("Your house no = ");
                int houseno=ob.nextInt();
                System.out.print("house Block = ");
                String block= ob.next();
                System.out.print("exact location = ");
                String location=ob.nextLine();
                ob.nextLine();
                System.out.print("Area = ");
                String area=ob.nextLine();
                ob.nextLine();
                ad[i]=new Adress(houseno,block,location,area);
            }
            else if (a==2)
            {

                System.out.println("******updation******");
                System.out.print("search for your house no to update");
                int h=ob.nextInt();
                int j;
                int shit=0;
                for(j=0;j<i;j++)
                {
                    if(h==ad[j].getHouseno())
                    {
                        shit=j;
                    }
                }
                System.out.print("which informantion do you want to change = ");
                System.out.println("""
                        
                        1.HouseNumber
                        2.Block
                        3.Location
                        4.Area""");
                int l= ob.nextInt();
                if(l==1)
                {
                    System.out.print("enter HouseNo=");
                    int p= ob.nextInt();
                    ad[shit].setHouseno(p);
                }
                else if(l==2)
                {
                    System.out.print("enter block=");
                    String B=ob.next();
                    ad[shit].setBlock(B);
                }
                else if (l==3)
                {
                    System.out.println("enter Location=");
                    String s=ob.nextLine();
                    ob.nextLine();
                    ad[shit].setLocation(s);
                }
                else if (l==4)
                {
                    System.out.println("enter Area");
                    String f=ob.nextLine();
                    ob.nextLine();
                    ad[shit].setArea(f);
                }
                else
                {
                    System.out.println("error606");
                }

            }
            else if (a==3) {
                System.out.println("Displaying infromation");
                int k;
                for(k=0;k<ad.length;k++)
                {
                    System.out.println("HouseNumber="+ad[k].getHouseno());
                    System.out.println("Block="+ad[k].getBlock());
                    System.out.println("Location="+ad[k].getLocation());
                    System.out.println("Area="+ad[k].getArea());
                }

            }
        }
    }
}
