package polymorphism.shapes;

public class Rectangle extends Shape {
    private final Double height;
    private final Double width;

    //Конструктора, който важи при създаване на правоъгълник от Шейп
    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    //Овъррайдваме с данните от правоъгълника
    public Double calculatePerimeter() {
        super.setPerimeter((height+width) * 2);
        return super.getPerimeter();
    }


    @Override
    //Овъррайдваме с данните от правоъгълника
    public Double calculateArea() {
        super.setArea(width * height);
        return super.getArea();
    }

}
