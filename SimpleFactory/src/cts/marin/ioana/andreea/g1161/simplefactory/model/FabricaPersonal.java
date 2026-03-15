package cts.marin.ioana.andreea.g1161.simplefactory.model;

public class FabricaPersonal {

    public static PersonalSpital getPersonal(TipPersonal tip, String nume, String prenume) {
        switch (tip) {
            case Brancardier:
                return new Brancardier(nume, prenume);
            case Asistent:
                return new Asistent(nume, prenume);
            case Medic:
                return new Medic(nume, prenume);
            default:
                throw new IllegalArgumentException("Tip personal necunoscut!");
        }
    }
}