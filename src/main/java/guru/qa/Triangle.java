package guru.qa;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double square() {
        double p = perimeter()/2;
        return Math.sqrt(p * (p - a) * (p - c) * (p - b));
    }

    public double perimeter() {
        return a + b + c;
    }
}