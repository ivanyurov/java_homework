package java_homework.introduction;

//  класс-родитель с методом area()
class Shape {
    public double area() {
        return 0;
    }
}

//  класс-потомок, наследующий метод area()
class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

//  класс-потомок, наследующий метод area()
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class LSP {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5);
        Shape s2 = new Circle(3);

        printArea(s1);
        printArea(s2);
    }

    public static void printArea(Shape shape) {
        System.out.println(shape.area());
    }
}
