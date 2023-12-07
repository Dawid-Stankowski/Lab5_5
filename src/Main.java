public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat("Kwadrat", "Czerwony", 5.0);
        Kolo kolo = new Kolo("Koło", "Niebieski", 3.0);

        System.out.println("Dane kwadratu:");
        System.out.println("Nazwa: " + kwadrat.getNazwa());
        System.out.println("Kolor: " + kwadrat.getKolor());
        System.out.println("Bok: " + kwadrat.getBok());
        System.out.println("Pole: " + kwadrat.obliczPole());
        System.out.println("Obwód: " + kwadrat.obliczObwod());

        System.out.println("\nDane koła:");
        System.out.println("Nazwa: " + kolo.getNazwa());
        System.out.println("Kolor: " + kolo.getKolor());
        System.out.println("Promień: " + kolo.getPromien());
        System.out.println("Pole: " + kolo.obliczPole());
        System.out.println("Obwód: " + kolo.obliczObwod());
    }
}
