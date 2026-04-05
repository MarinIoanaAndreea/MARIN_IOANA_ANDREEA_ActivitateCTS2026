package cts.marin.ioana.andreea.g1161.decorator.model;

public class RezultatPrintat extends ARezultat {
    private String numePacient;
    private String rezultat;

    public RezultatPrintat(String numePacient, String rezultat) {
        this.numePacient = numePacient;
        this.rezultat = rezultat;
    }

    @Override
    public String getModalitateTransmitere() {
        return "Rezultatul este oferit printat pacientului " + numePacient + ".";
    }

    @Override
    public String getDetaliiRezultat() {
        return "Rezultat analize: " + rezultat;
    }
}