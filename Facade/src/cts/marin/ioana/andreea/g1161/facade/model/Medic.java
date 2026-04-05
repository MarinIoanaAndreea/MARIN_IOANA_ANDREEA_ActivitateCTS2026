package cts.marin.ioana.andreea.g1161.facade.model;

public class Medic {
    private String nume;
    private boolean confirmaInternare;

    public Medic(String nume, boolean confirmaInternare) {
        this.nume = nume;
        this.confirmaInternare = confirmaInternare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isConfirmaInternare() {
        return confirmaInternare;
    }
}