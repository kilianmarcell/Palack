package hu.petrik;

public class VisszavalthatoPalack extends Palack {
    private int palackDij;

    public VisszavalthatoPalack(String ital, int maxUrtartalom, int jelenlegiUrtartalom, int palackDij) {
        super(ital, maxUrtartalom, jelenlegiUrtartalom);
        this.palackDij = palackDij;
    }

    @Override
    public String toString() {
        return "Visszaváltható " + super.toString();
    }
}
