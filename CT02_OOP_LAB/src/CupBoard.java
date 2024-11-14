public class CupBoard {
    static int items;

    public CupBoard() {
        this.items =0;
    }
    public CupBoard(int items)
    {
        this.items=items;
    }
    public void additems()
    {
        items++;
        System.out.println(items);
    }
    public void additems(int x)
    {
        items+=x;
        System.out.println(items);
    }
    public void open()
    {
        System.out.println("Cupboard Open");
    }
}
