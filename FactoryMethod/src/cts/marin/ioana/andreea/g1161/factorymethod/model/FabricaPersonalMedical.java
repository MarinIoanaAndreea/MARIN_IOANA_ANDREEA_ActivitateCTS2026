package cts.marin.ioana.andreea.g1161.factorymethod.model;

public class FabricaPersonalMedical implements FabricaPersonal {

    private String tip;

    public FabricaPersonalMedical(String tip) {
        this.tip = tip;
    }

    @Override
    public PersonalSpital createPersonal() {
        switch (tip) {
            case "Brancardier": return new Brancardier();
            case "Asistent": return new Asistent();
            case "Medic": return new Medic();
            default: throw new IllegalArgumentException("Tip necunoscut!");
        }
    }
}