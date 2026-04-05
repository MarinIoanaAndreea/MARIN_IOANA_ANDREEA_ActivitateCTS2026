package cts.marin.ioana.andreea.g1161.facade.model;

public class Facade {

    public boolean verificaInternare(Pacient pacient, Medic medic, Salon salon) {
        if (pacient.isStareGrava() && medic.isConfirmaInternare() && salon.getNumarPaturiLibere() > 0) {
            return true;
        }
        return false;
    }
}