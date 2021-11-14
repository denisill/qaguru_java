package guru.qa;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;
    private ColorFigure colorFigure;

    public Triangle(double sideA, double sideB, double sideC, ColorFigure colorFigure) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.colorFigure = colorFigure;
    }

    static class ColorFigure {
        String color;

        public ColorFigure(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double square() {
        double p = perimeter()/2;
        return Math.sqrt(p * (p - sideA) * (p - sideC) * (p - sideB));
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }
}