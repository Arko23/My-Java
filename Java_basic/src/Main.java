import java.util.Scanner;
//nth postion ="Marks code";

public class Main {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter a number : ");
                int inputNumber = scan.nextInt();
                System.out.print("N-th position : ");
                int position = scan.nextInt();

                int x = inputNumber;
                int count = 0;

                while (x != 0) {
                    x = x / 10;
                    count++;      //counting the number if digits.
                }

                int[] dig = new int[count];

                for (int i = count - 1; i >= 0; i--) {
                    dig[i] = inputNumber % 10;
                    inputNumber /= 10;
                }

                if (position <= count) {
                    System.out.println("The " + position + "-th digit is -> " + dig[position - 1]);
                } else {
                    System.out.println("Digit not found!");
                }

    }
}