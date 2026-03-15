package cts.marin.ioana.andreea.g1161.simplefactory.main;

import cts.marin.ioana.andreea.g1161.simplefactory.model.FabricaPersonal;
import cts.marin.ioana.andreea.g1161.simplefactory.model.PersonalSpital;
import cts.marin.ioana.andreea.g1161.simplefactory.model.TipPersonal;

public class Main {
    public static void main(String[] args) {

        PersonalSpital p1 = FabricaPersonal.getPersonal(TipPersonal.Medic, "Ionescu", "Ion");
        PersonalSpital p2 = FabricaPersonal.getPersonal(TipPersonal.Asistent, "Popescu", "Maria");
        PersonalSpital p3 = FabricaPersonal.getPersonal(TipPersonal.Brancardier, "Gheorghe", "Andrei");
        PersonalSpital p4 = FabricaPersonal.getPersonal(TipPersonal.Medic, "Marin", "Ana");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        p1.descrieRol();
        p2.descrieRol();
        p3.descrieRol();
        p4.descrieRol();
    }
}