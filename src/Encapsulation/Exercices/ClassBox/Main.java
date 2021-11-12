package Encapsulation.Exercices.ClassBox;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double l = Double.parseDouble(scan.nextLine());
        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        Box box = new Box(l, w, h);

        System.out.println(box);

    }
}
