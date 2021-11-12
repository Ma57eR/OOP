package Encapsulation.Exercices.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    private void setLength(double length) {
        if (length <= 0) {
            String side = "Length";
            wrongMeasure(side);
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            String side = "Width";
            wrongMeasure(side);
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            String side = "Height";
            wrongMeasure(side);
        }
        this.height = height;
    }
    public double calculateSurfaceArea() {
        return ((this.length * this.height * 2) + (this.width * this.height * 2) + (this.length * this.width * 2));
    }
    public double calculateLateralSurfaceArea() {
       return  ((this.length * this.height * 2) + (this.width * this.height * 2));
    }

    public double calculateVolume() {
        return this.height * this.width * this.length;
    }
    private void wrongMeasure(String side) {
        throw new IllegalArgumentException(side + " cannot be zero or negative");
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%n" +
                "Lateral Surface Area - %.2f%n" +
                "Volume - %.2f", calculateSurfaceArea(), calculateLateralSurfaceArea(), calculateVolume());
    }
}
