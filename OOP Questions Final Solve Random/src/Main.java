import java.io.File;

public class Main {
    public static void main(String[] args) {
        File dir=new File("C:/Users/hp/Desktop/person");
        dir.mkdir();
        String location=dir.getAbsolutePath();
        System.out.println(location);
        System.out.println(dir.getName());
        /*if(dir.delete())
        {
            System.out.println("Folder is Deleted");
        }*/


    }
}