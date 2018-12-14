public class Quadrat extends Figure{

    public int seitenLaenge;

    public Quadrat(int seitenLaenge) {
        this.seitenLaenge = seitenLaenge;
    }

    public int getSeitenLaenge() {
        return seitenLaenge;
    }

    public double getArea() {
        return getSeitenLaenge() * getSeitenLaenge();
    }

    public double getCircumference() {
        return  4 * getSeitenLaenge();
    }

    public double area() {
        return 0;
    }

    public double circumference() {
        return 0;
    }

    @Override
    public String toString() {
        return "Quadrat mit Seitenlänge 3: Fläche -> " + getArea() + ", Umfang -> " + getCircumference();
    }
}
