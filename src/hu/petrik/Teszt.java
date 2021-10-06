package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Teszt {
    private ArrayList<Rekesz> rekeszek;

    public Teszt() {
        this.rekeszek = new ArrayList<>();
        elso();
        masodik();
    }

    public void masodik() {
        Beolvas();
    }

    public void Beolvas() {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader("palackok.txt"));
            rekeszek.add(new Rekesz(5000));
            String sor = bReader.readLine();
            while (sor != null) {
                Palack p;
                String[] egySor = sor.split(";");
                if (egySor.length == 2){
                    p = new Palack(egySor[0], Integer.parseInt(egySor[1]));
                } else if (egySor.length == 3) {
                    p = new Palack(egySor[0], Integer.parseInt(egySor[1]), Integer.parseInt(egySor[2]));
                } else {
                    p = new VisszavalthatoPalack(egySor[0], Integer.parseInt(egySor[1]), Integer.parseInt(egySor[2]), Integer.parseInt(egySor[3]));
                }
                boolean siker = rekeszek.get(rekeszek.size()-1).ujPalack(p);
                if (!siker) {
                    rekeszek.add(new Rekesz(1000));
                    rekeszek.get(rekeszek.size()-1).ujPalack(p);
                }
                sor = bReader.readLine();
            }
        }   catch (IOException e) {
            e.getMessage();
        }
    }

    public static void elso() {
        Palack p1 = new Palack("tej", 1000, 1000);
        Palack p2 = new Palack("kakaó", 500);
        VisszavalthatoPalack vp1 = new VisszavalthatoPalack("kóla", 200, 200, 25);
        Rekesz r1 = new Rekesz(1000);
        r1.ujPalack(p1);
        r1.ujPalack(p2);
        r1.ujPalack(vp1);

        System.out.println(p1.toString() + "\n");
        System.out.println(p2.toString() + "\n");
        System.out.println(vp1.toString() + "\n");
        System.out.println(r1.toString());
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < rekeszek.size(); i++) {
            s += i+1 + ". rekesz\n" + rekeszek.get(i) + "\n\n";
        }
        return s;
    }
}
