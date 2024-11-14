package set_1;
/*1. Create a class named “Box” which has 3 attribute: length, width, height and a method named
        getVolume(). getVolume() method will calculate the volume of the Box and return the value.
        From “main” method create 2 Box objects with different length, width, height, then call the
        getVolume() method and print the volumes.*/

public class Box {
    int len,wid,hei;

   public Box(int len,int wid,int hei)
   {
       this.len=len;
       this.wid=wid;
       this.hei=hei;
   }
   public double Getvoulume()
   {
       double vol=(len*wid*hei);
       return vol;
   }


}
