package com.sistematizacao;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Principal {

        private final static int MAX_ALUNOS = 50;
        private final static byte[] SEED = {0, 100};

        public static void main(String[] args) {
            SecureRandom randNum = new SecureRandom(SEED);
            double notaRand;
            int numAlunos = randNum.nextInt(MAX_ALUNOS);
            List<Double> notas = new ArrayList<>();

            for (int i = 0; i < numAlunos; i++) {
                notaRand = randNum.nextFloat()*100;
                notas.add(notaRand);
            }

            System.out.println("Qnt Alunos:" + numAlunos);
            System.out.println("Notas:" + notas);
            System.out.println("Média das notas:" + Estatistica.media(notas));
            System.out.println("Desvio padrão das notas:" + Estatistica.desvioPadrao(notas));
        }
    }

