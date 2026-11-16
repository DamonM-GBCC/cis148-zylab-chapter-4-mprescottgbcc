import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();

        int smallest = Math.min(num1, Math.min(num2, num3));

        System.out.println(smallest);

    }
}
