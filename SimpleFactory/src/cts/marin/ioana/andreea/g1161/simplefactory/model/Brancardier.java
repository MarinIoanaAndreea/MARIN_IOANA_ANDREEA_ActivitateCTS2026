package cts.marin.ioana.andreea.g1161.simplefactory.model;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void descrieRol() {
        System.out.println("Brancardierul " + nume + " " + prenume + " transporta pacientii in spital.");
    }
}