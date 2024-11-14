import java.io.File;

public class MakeFile {
    public static void main(String[] args) {
        File dir = new File("C:/Users/hp/Desktop/Student");
        dir.mkdir();
        String location= dir.getAbsolutePath();
        System.out.println(location);
        File f1 = new File("C:/Users/hp/Desktop/Student/Mark.txt");
        File f2 = new File("C:/Users/hp/Desktop/Student/Arko.txt");

        try {
            f1.createNewFile();
            f2.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }
        if (f1.exists()) {
            System.out.println("File exists");
        }


    }
}
