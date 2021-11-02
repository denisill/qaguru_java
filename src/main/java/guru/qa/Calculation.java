package guru.qa;

public class Calculation {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 2;
        triangle.b = 4;
        triangle.c = 5;
        System.out.println("Площадь треуголника: " + triangle.square());
        System.out.println("Периметр треугольника: " + triangle.perimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.a = 4;
        rectangle.b = 5;
        System.out.println("Площадь прямоугольника: " + rectangle.square());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
    }
}
