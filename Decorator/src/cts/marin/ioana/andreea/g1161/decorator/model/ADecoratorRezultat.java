package cts.marin.ioana.andreea.g1161.decorator.model;

public abstract class ADecoratorRezultat extends ARezultat {
    protected ARezultat rezultat;

    public ADecoratorRezultat(ARezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public String getModalitateTransmitere() {
        return rezultat.getModalitateTransmitere();
    }

    @Override
    public String getDetaliiRezultat() {
        return rezultat.getDetaliiRezultat();
    }
}