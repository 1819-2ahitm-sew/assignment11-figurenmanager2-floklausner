public class Rechteck extends Figure{

    public int length;
    public int width;

    public Rechteck(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getCircumference() {
        return  2 * (getLength() + getWidth());
    }

    public double area() {
        return 0;
    }

    public double circumference() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rechteck mit einer Länge von 4 und einer Breite von 3: Fläche -> " + getArea() + ", Umfang -> " + getCircumference();
    }
}
