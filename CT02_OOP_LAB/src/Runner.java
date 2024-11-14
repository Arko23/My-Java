public class Runner {
    public static void main(String[]args)
    {
        CupBoard c=new CupBoard(5);
        c.open();
        c.additems();
        CupboardNarnia n=new CupboardNarnia();
        RoomofRequiremets r=new RoomofRequiremets();
        n.additems(3);
        r.additems(100);
        CupBoard ref=n;
        ref.open();
        ref=r;
        ref.open();

    }
}
