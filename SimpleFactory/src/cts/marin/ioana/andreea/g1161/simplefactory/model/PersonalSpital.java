package cts.marin.ioana.andreea.g1161.simplefactory.model;

public abstract class PersonalSpital {
    protected String nume;
    protected String prenume;

    public PersonalSpital(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public abstract void descrieRol();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{nume='" + nume + "', prenume='" + prenume + "'}";
    }
}