package cts.marin.ioana.andreea.g1161.prototype.model;

import java.util.HashMap;
import java.util.Map;

public class RetetaMedicament implements IRetetaMedicament {

    private String numeMedicament;
    private Map<String, Double> solutii;

    public RetetaMedicament(String numeMedicament, Map<String, Double> solutii) {
        this.numeMedicament = numeMedicament;
        this.solutii = new HashMap<>(solutii);
    }

    @Override
    public IRetetaMedicament clone() throws CloneNotSupportedException {
        return (IRetetaMedicament) super.clone();
    }

    @Override
    public String toString() {
        return "RetetaMedicament{" +
                "numeMedicament='" + numeMedicament + '\'' +
                ", solutii=" + solutii +
                '}';
    }
}