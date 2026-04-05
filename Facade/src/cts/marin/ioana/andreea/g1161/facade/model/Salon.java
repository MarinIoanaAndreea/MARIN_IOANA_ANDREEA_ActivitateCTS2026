package cts.marin.ioana.andreea.g1161.facade.model;

public class Salon {
    private int numarSalon;
    private int numarPaturiLibere;

    public Salon(int numarSalon, int numarPaturiLibere) {
        this.numarSalon = numarSalon;
        this.numarPaturiLibere = numarPaturiLibere;
    }

    public int getNumarSalon() {
        return numarSalon;
    }

    public int getNumarPaturiLibere() {
        return numarPaturiLibere;
    }
}