package polymorphism.shapes;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2.0, 3.0);
        Shape circle = new Circle(2.0);

        System.out.println("Area of Rectangle is: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle is: " + rectangle.calculatePerimeter());
        System.out.println("Area of Circle is: " + circle.calculateArea());
        System.out.println("Perimeter of Circle is: " + circle.calculatePerimeter());
    }
}
