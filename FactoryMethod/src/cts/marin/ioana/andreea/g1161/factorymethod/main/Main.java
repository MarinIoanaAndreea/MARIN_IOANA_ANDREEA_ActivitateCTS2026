package cts.marin.ioana.andreea.g1161.factorymethod.main;

import cts.marin.ioana.andreea.g1161.factorymethod.model.FabricaPersonal;
import cts.marin.ioana.andreea.g1161.factorymethod.model.FabricaPersonalMedical;
import cts.marin.ioana.andreea.g1161.factorymethod.model.FabricaPersonalNonMedical;
import cts.marin.ioana.andreea.g1161.factorymethod.model.PersonalSpital;

public class Main {
    public static void main(String[] args) {

        FabricaPersonal fabricaMedic = new FabricaPersonalMedical("Medic");
        FabricaPersonal fabricaBrancardier = new FabricaPersonalMedical("Brancardier");
        FabricaPersonal fabricaAsistent = new FabricaPersonalMedical("Asistent");
        FabricaPersonal fabricaSecretar = new FabricaPersonalNonMedical("Secretar");
        FabricaPersonal fabricaRegistrator = new FabricaPersonalNonMedical("Registrator");

        PersonalSpital medic = fabricaMedic.createPersonal();
        PersonalSpital brancardier = fabricaBrancardier.createPersonal();
        PersonalSpital asistent = fabricaAsistent.createPersonal();
        PersonalSpital secretar = fabricaSecretar.createPersonal();
        PersonalSpital registrator = fabricaRegistrator.createPersonal();

        medic.descrieRol();
        brancardier.descrieRol();
        asistent.descrieRol();
        secretar.descrieRol();
        registrator.descrieRol();
    }
}