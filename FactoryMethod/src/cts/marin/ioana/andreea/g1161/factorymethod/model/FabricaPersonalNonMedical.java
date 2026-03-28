package cts.marin.ioana.andreea.g1161.factorymethod.model;

public class FabricaPersonalNonMedical implements FabricaPersonal {

    private String tip;

    public FabricaPersonalNonMedical(String tip) {
        this.tip = tip;
    }

    @Override
    public PersonalSpital createPersonal() {
        switch (tip) {
            case "Secretar": return new Secretar();
            case "Registrator": return new Registrator();
            default: throw new IllegalArgumentException("Tip necunoscut!");
        }
    }
}