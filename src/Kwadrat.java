public class Kwadrat extends Figura {
    private double bok;

    public Kwadrat(String nazwa, String kolor, double bok) {
        super(nazwa, kolor);
        this.bok = bok;
    }

    public double getBok() {
        return bok;
    }

    public double obliczPole() {
        return bok * bok;
    }

    public double obliczObwod() {
        return 4 * bok;
    }
}
