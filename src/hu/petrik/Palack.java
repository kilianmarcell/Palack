package hu.petrik;

public class Palack {
    private String ital;
    private int maxUrtartalom;
    private int jelenlegiUrtartalom;

    public Palack(String ital, int maxUrtartalom) {
        this.ital = ital;
        this.maxUrtartalom = maxUrtartalom;
        this.jelenlegiUrtartalom = 1;
    }

    public Palack(String ital, int maxUrtartalom, int jelenlegiUrtartalom) {
        this.ital = ital;
        this.maxUrtartalom = maxUrtartalom;
        this.jelenlegiUrtartalom = jelenlegiUrtartalom;
    }

    public int getJelenlegiUrtartalom() {
        return jelenlegiUrtartalom;
    }

    public void setJelenlegiUrtartalom(int bejovoJelenlegiUrtartalom) {
        if (bejovoJelenlegiUrtartalom > maxUrtartalom) {
            jelenlegiUrtartalom = maxUrtartalom;
        } else {
            jelenlegiUrtartalom = bejovoJelenlegiUrtartalom;
        }

        if (jelenlegiUrtartalom == 0) {
            ital = "";
        }
    }

    public double suly() {
        return maxUrtartalom / 35 + jelenlegiUrtartalom;
    }

    public boolean egyenloekE(Palack p) {
        boolean egyezik = false;
        if (ital.equals(p.ital) && maxUrtartalom == p.maxUrtartalom && jelenlegiUrtartalom == p.jelenlegiUrtartalom) {
            egyezik = true;
        }
        return egyezik;
    }

    public void hozzaont(Palack p) {
        setJelenlegiUrtartalom(jelenlegiUrtartalom + p.jelenlegiUrtartalom);
        if (ital != p.ital) {
            ital = "keverék";
        } else if (ital == "") {
            ital = p.ital;
        }
    }

    @Override
    public String toString() {
        return String.format("Palack, benne lévő ital: %s, jelenleg %d ml van benne, maximum %d ml fér bele.", ital, jelenlegiUrtartalom, maxUrtartalom);
    }
}