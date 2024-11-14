package pb_B_1;

public class Adress {
    private int houseno;
    private String block;
    private String location;
    private String area;

    public Adress(int houseno, String block, String location, String area) {
        this.houseno = houseno;
        this.block = block;
        this.location = location;
        this.area = area;
    }

    public int getHouseno() {
        return houseno;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;

    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
