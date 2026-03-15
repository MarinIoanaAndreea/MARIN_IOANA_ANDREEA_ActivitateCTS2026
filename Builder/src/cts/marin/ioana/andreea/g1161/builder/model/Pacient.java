package cts.marin.ioana.andreea.g1161.builder.model;

public class Pacient {
    private String nume;
    private String prenume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    private Pacient() {
    }

    public static class PacientBuilder {
        private String nume;
        private String prenume;
        private boolean patRabatabil = false;
        private boolean micDejunInclus = false;
        private boolean papuciCamera = false;
        private boolean halatInterior = false;

        public PacientBuilder(String nume, String prenume) {
            this.nume = nume;
            this.prenume = prenume;
        }

        public PacientBuilder cuPatRabatabil() {
            this.patRabatabil = true;
            return this;
        }

        public PacientBuilder cuMicDejun() {
            this.micDejunInclus = true;
            return this;
        }

        public PacientBuilder cuPapuci() {
            this.papuciCamera = true;
            return this;
        }

        public PacientBuilder cuHalat() {
            this.halatInterior = true;
            return this;
        }

        public Pacient build() {
            Pacient p = new Pacient();
            p.nume = this.nume;
            p.prenume = this.prenume;
            p.patRabatabil = this.patRabatabil;
            p.micDejunInclus = this.micDejunInclus;
            p.papuciCamera = this.papuciCamera;
            p.halatInterior = this.halatInterior;
            return p;
        }
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }
}