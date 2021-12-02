package Abstract.PointRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bottomLeftX = input[0];
        int bottomLeftY = input[1];
        int topRightX = input[2];
        int topRightY = input[3];
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
        Point pointA = new Point(bottomLeftX, bottomLeftY);
        Point pointB = new Point(topRightX, topRightY);
        Rectangle rectangle = new Rectangle(pointA, pointB);
        int[] points = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Point point = new Point(points[0], points[1]);

        System.out.println(rectangle.contains(point));
        }

    }
}
