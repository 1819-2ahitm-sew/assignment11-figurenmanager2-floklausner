public class Kreis extends Figure {

    public int radius;

    public Kreis(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return  2 * radius * Math.PI;
    }

    public double area() {
        return 0;
    }

    public double circumference() {
        return 0;
    }

    @Override
    public String toString() {
        return "Kreis mit Radius 5: Fläche -> " + getArea() + ", Umfang -> " + getCircumference();
    }
}
