interface person{
    void intro();
}

public class AnonEx  {
    public static void main(String[]args) {

        person engineer=new person(){
            public void intro(){
                System.out.println("ami engineer");
            }
        };
        person doc=new person() {
            @Override
            public void intro() {
                System.out.println("ami doctor");
            }
        };


        engineer.intro();
        doc.intro();
    }
}
