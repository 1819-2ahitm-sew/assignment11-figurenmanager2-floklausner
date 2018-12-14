public abstract class Figure {

    static Rechteck rechteck = new Rechteck(3,4);
    static Quadrat quadrat = new Quadrat(3);
    static Kreis kreis = new Kreis(5);
    static Ellipse ellipse = new Ellipse(10, 6);

    public abstract double area();
    public abstract double circumference();
    abstract public String toString();
}
