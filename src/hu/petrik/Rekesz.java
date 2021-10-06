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

    public void ujPalack(Palack p) {
        if (p.suly() + suly() <= maxTeherbiras) {
            palackok.add(p);
        }
    }
}
