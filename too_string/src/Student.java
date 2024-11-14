import java.util.*;

public class Student {
public static void main(String[]args) {
   Scanner ob = new Scanner(System.in);

   int[] arr = new int[5];
   for (int i = 0; i < arr.length; i++) {
      arr[i] = ob.nextInt();
   }
   System.out.println(Arrays.toString(arr));
}
}
