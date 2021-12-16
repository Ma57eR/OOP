package Abstract.RhombusStars;

import java.util.Scanner;

public class Rombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= size; i++) {
            printStars(size, i);
        }
        for (int i = size-1; i >= 1 ; i--) {
            printStars(size, i);
        }
    }

    private static void printStars(int size, int stars) {
        for (int i = 1; i <= size-stars ; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= stars ; i++) {
        System.out.print("* ");
        }
        System.out.println();
    }

}
