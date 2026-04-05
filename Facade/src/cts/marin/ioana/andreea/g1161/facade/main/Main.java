package cts.marin.ioana.andreea.g1161.facade.main;

import cts.marin.ioana.andreea.g1161.facade.model.Facade;
import cts.marin.ioana.andreea.g1161.facade.model.Medic;
import cts.marin.ioana.andreea.g1161.facade.model.Pacient;
import cts.marin.ioana.andreea.g1161.facade.model.Salon;

public class Main {
    public static void main(String[] args) {

        Pacient pacient1 = new Pacient("Popescu", true);
        Medic medic1 = new Medic("Ionescu", true);
        Salon salon1 = new Salon(101, 2);

        Pacient pacient2 = new Pacient("Marin", false);
        Medic medic2 = new Medic("Georgescu", true);
        Salon salon2 = new Salon(102, 0);

        // fara Facade
        if (pacient1.isStareGrava() && medic1.isConfirmaInternare() && salon1.getNumarPaturiLibere() > 0) {
            System.out.println("Pacientul " + pacient1.getNume() + " poate fi internat.");
        } else {
            System.out.println("Pacientul " + pacient1.getNume() + " nu poate fi internat.");
        }

        // cu Facade
        Facade facade = new Facade();

        System.out.println("Rezultat pacient 1: " + facade.verificaInternare(pacient1, medic1, salon1));
        System.out.println("Rezultat pacient 2: " + facade.verificaInternare(pacient2, medic2, salon2));
    }
}