// Абстрактний клас або інтерфейс для геометричних фігур
interface Shape {
    double calculateArea();
}

// Клас "Коло"
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Клас "Прямокутник"
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Клас "Трикутник"
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Приклад використання
public class Main {
    public static void main(String[] args) {
        // Створення об'єктів геометричних фігур
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 8.0);

        // Виведення площі кожної фігури
        System.out.println("Площа кола: " + circle.calculateArea());
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());
        System.out.println("Площа трикутника: " + triangle.calculateArea());
    }
}
