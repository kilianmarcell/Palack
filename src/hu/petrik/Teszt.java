package hu.petrik;

public class Teszt {

    public Teszt() {
        elso();
    }

    public void masodik() {
        Beolvas();
    }

    public void Beolvas() {}

    public static void elso() {
        Palack p1 = new Palack("tej", 1000, 1000);
        Palack p2 = new Palack("kakaó", 500);
        VisszavalthatoPalack vp1 = new VisszavalthatoPalack("kóla", 200, 200, 25);
        Rekesz r1 = new Rekesz(9000);
        r1.ujPalack(p1);
        r1.ujPalack(p2);
        r1.ujPalack(vp1);

        System.out.println(p1.toString() + "\n");
        System.out.println(p2.toString() + "\n");
        System.out.println(vp1.toString() + "\n");
        System.out.println(r1.toString());
    }
}
