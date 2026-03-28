package cts.marin.ioana.andreea.g1161.prototype.main;

import cts.marin.ioana.andreea.g1161.prototype.model.IRetetaMedicament;
import cts.marin.ioana.andreea.g1161.prototype.model.RetetaMedicament;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Map<String, Double> solutii = new HashMap<>();
        solutii.put("Ibuprofen", 400.0);
        solutii.put("Amidon", 150.0);
        solutii.put("Celuloza", 50.0);

        RetetaMedicament reteta1 = new RetetaMedicament("Nurofen", solutii);
        System.out.println("Reteta originala: " + reteta1);

        IRetetaMedicament reteta2 = reteta1.clone();
        System.out.println("Reteta clonata 1: " + reteta2);

        IRetetaMedicament reteta3 = reteta1.clone();
        System.out.println("Reteta clonata 2: " + reteta3);

        IRetetaMedicament reteta4 = reteta1.clone();
        System.out.println("Reteta clonata 3: " + reteta4);
    }
}