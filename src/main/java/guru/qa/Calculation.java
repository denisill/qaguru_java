package guru.qa;

public class Calculation {
    public static void main(String[] args) {
        Triangle.ColorFigure colorFigure = new Triangle.ColorFigure("Black");
        Triangle triangle = new Triangle(2, 4, 5, colorFigure);
        System.out.println("Сторона треугольника A = " + triangle.getSideA());
        System.out.println("Сторона треугольника B = " + triangle.getSideB());
        System.out.println("Сторона треугольника C = " + triangle.getSideC());
        System.out.println("Цвет трегуольника: " + colorFigure.getColor());
        System.out.println("Площадь треугольника: " + triangle.square());
        System.out.println("Периметр треугольника: " + triangle.perimeter());
        triangle.setSideA(3);
        triangle.setSideB(7);
        triangle.setSideC(6);
        colorFigure.setColor("Red");
        System.out.println("Новый цвет треугольника: " + colorFigure.getColor());
        System.out.println("Новая площадь треугольника: " + triangle.square());
        System.out.println("Новая периметр треугольника: " + triangle.perimeter());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Сторона прямоугольника A = " + rectangle.getSideA());
        System.out.println("Сторона прямоугольника B = " + rectangle.getSideB());
        System.out.println("Площадь прямоугольника: " + rectangle.square());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
        rectangle.setSideA(7);
        rectangle.setSideB(4);
        System.out.println("Новая площадь прямоугольника: " + rectangle.square());
        System.out.println("Новый периметр прямоугольника: " + rectangle.perimeter());
    }
}
