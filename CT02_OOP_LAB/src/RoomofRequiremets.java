import java.util.Scanner;

public class RoomofRequiremets extends CupBoard{
    Scanner ob=new Scanner(System.in);
    private int password=6969;
    public void RoomofRequirements() {

    }
    @Override
    public void open()
    {
        System.out.print("enter password = ");
        int n= ob.nextInt();
        if(password == n)
        {
            System.out.println("Open room of Requirement");
        }
        else
        {
            System.out.println("There is no room of requirement");
        }
    }
}

