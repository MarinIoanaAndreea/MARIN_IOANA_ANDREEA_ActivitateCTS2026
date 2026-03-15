package cts.marin.ioana.andreea.g1161.simplefactory.model;

public class Medic extends PersonalSpital {

    public Medic(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void descrieRol() {
        System.out.println("Medicul " + nume + " " + prenume + " diagnosticheaza si trateaza pacientii.");
    }
}