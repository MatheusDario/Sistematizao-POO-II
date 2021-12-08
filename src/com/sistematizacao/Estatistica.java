package com.sistematizacao;

import java.util.List;

public class Estatistica {

    public static Double media(List<Double> notas) {
        Double sumTotal = 0.0;
        Double qntNotas = Double.valueOf(notas.size());
        Double mediaNotas = 0.0;

        for(Double aux : notas) {
            sumTotal += aux;
        }
        mediaNotas = sumTotal/qntNotas;

        return mediaNotas;
    }

    public static Double desvioPadrao(List<Double> notas) {
        double tam = notas.size();
        Double desvPadrao = 0.0;
        Double desvioPadrao = 0.0;

        for (Double vlr : notas) {
            Double aux = vlr - media(notas);
            desvPadrao += aux * aux;
        }
        desvioPadrao = Math.sqrt(desvPadrao / (tam - 1.0));

        return desvioPadrao;
    }

}
