class Rectangle {
    
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 2.0;
    }

    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Default Rectangle:");
        defaultRectangle.display();

        Rectangle square = new Rectangle(5.0);
        System.out.println("\nSquare:");
        square.display();

        Rectangle customRectangle = new Rectangle(4.0, 7.0);
        System.out.println("\nCustom Rectangle:");
        customRectangle.display();

        System.out.println("\nOverloaded Area Calculation:");
        double area = customRectangle.calculateArea(3.0, 6.0);
        System.out.println("Area with provided dimensions (3.0, 6.0): " + area);
    }
}

