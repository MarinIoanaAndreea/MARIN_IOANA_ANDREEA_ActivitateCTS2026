package cts.marin.ioana.andreea.g1161.simplefactory.model;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void descrieRol() {
        System.out.println("Asistentul " + nume + " " + prenume + " ajuta medicii in efectuarea tratamentelor.");
    }
}