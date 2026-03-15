package cts.marin.ioana.andreea.g1161.builder.main;

import cts.marin.ioana.andreea.g1161.builder.model.Pacient;

public class Main {
    public static void main(String[] args) {

        Pacient p1 = new Pacient.PacientBuilder("Marin", "Ion")
                .cuPatRabatabil()
                .cuMicDejun()
                .build();

        Pacient p2 = new Pacient.PacientBuilder("Ionescu", "Maria")
                .cuHalat()
                .cuPapuci()
                .build();

        Pacient p3 = new Pacient.PacientBuilder("Popescu", "Andrei")
                .build();

        Pacient p4 = new Pacient.PacientBuilder("Gheorghe", "Ana")
                .cuPatRabatabil()
                .cuHalat()
                .cuPapuci()
                .cuMicDejun()
                .build();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}