public class Ellipse extends Figure {

    public double hauptachse;
    public double nebenachse;

    public Ellipse(double hauptachse, double nebenachse) {
        this.hauptachse = hauptachse;
        this.nebenachse = nebenachse;
    }

    public double getHauptachse() {
        return hauptachse;
    }

    public double getNebenachse() {
        return nebenachse;
    }

    public double getArea() {
        return Math.PI * hauptachse * nebenachse;
    }

    public double getCircumference() {
        double lambda;

        lambda = (getHauptachse() - getNebenachse()) / (getHauptachse() + getNebenachse());

        return (getHauptachse() + getNebenachse()) * Math.PI * (1 + ((3 * lambda * lambda)) / (10 + Math.sqrt(4 - 3 * lambda * lambda)));
    }

    public double area() {
        return 0;
    }

    public double circumference() {
        return 0;
    }

    @Override
    public String toString() {
        return "Ellipse mit Hauptachse 10 und Nebenachse 6: Fläche -> " + getArea() + ", Umfang -> " + getCircumference();
    }
}
