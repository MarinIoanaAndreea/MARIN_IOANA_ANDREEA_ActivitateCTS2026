package cts.marin.ioana.andreea.g1161.decorator.main;

import cts.marin.ioana.andreea.g1161.decorator.model.ARezultat;
import cts.marin.ioana.andreea.g1161.decorator.model.DecoratorOnline;
import cts.marin.ioana.andreea.g1161.decorator.model.RezultatPrintat;

public class Main {
    public static void main(String[] args) {

        ARezultat rezultatPrintat = new RezultatPrintat("Popescu Ion", "Hemoleucograma normala");
        System.out.println(rezultatPrintat.getModalitateTransmitere());
        System.out.println(rezultatPrintat.getDetaliiRezultat());

        ARezultat rezultatOnline = new DecoratorOnline(rezultatPrintat);
        System.out.println(rezultatOnline.getModalitateTransmitere());
        System.out.println(rezultatOnline.getDetaliiRezultat());
    }
}