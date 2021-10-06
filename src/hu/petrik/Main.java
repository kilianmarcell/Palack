package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Palack p1 = new Palack("tej", 1000, 1000);
        Palack p2 = new Palack("kakaó", 500);
        VisszavalthatoPalack vp1 = new VisszavalthatoPalack("kóla", 200, 200, 25);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(vp1.toString());
    }
}
