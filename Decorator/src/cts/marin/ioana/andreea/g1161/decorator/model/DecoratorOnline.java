package cts.marin.ioana.andreea.g1161.decorator.model;

public class DecoratorOnline extends ADecoratorRezultat {

    public DecoratorOnline(ARezultat rezultat) {
        super(rezultat);
    }

    @Override
    public String getModalitateTransmitere() {
        return super.getModalitateTransmitere() + " Rezultatul este disponibil si online pe platforma.";
    }

    @Override
    public String getDetaliiRezultat() {
        return super.getDetaliiRezultat();
    }
}