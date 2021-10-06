package hu.petrik;

import java.util.ArrayList;

public class Rekesz {
    private int maxTeherbiras;
    private ArrayList<Palack> palackok;

    public Rekesz(int maxTeherbiras) {
        this.maxTeherbiras = maxTeherbiras;
        palackok = new ArrayList<>();
    }

    public int suly() {
        int ossz = 0;
        for (Palack p: palackok) {
            ossz += p.suly();
        }
        return ossz;
    }

    public boolean ujPalack(Palack p) {
        boolean joE = false;
        if (p.suly() + suly() <= maxTeherbiras) {
            palackok.add(p);
            joE = false;
        }
        return joE;
    }

    public int osszesPenz() {
        int ossz = 0;
        for (Palack p: palackok) {
            if (p instanceof VisszavalthatoPalack) {
                ossz += ((VisszavalthatoPalack) p).getPalackDij();
            }
        }
        return ossz;
    }

    @Override
    public String toString() {
        String s = "";
        for (Palack p: palackok) {
            s += p + "\n";
        }
        return s;
    }
}
