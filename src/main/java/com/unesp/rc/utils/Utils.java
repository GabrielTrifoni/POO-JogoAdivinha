package com.unesp.rc.utils;

import java.util.Objects;
import static java.lang.Math.sqrt;

public class Utils {
    public static int[] criaVetor() {
        int[] vetor = new int[100];
        int random;

        for (int i = 0; i < 250; i++) {
            random = (int) (Math.random() * 100);
            vetor[random]++;
        }

        return vetor;
    }

    public static int verificaResposta(int[] vetor, int numEscolhido, String escolha) {
        int boolResposta = 0;

        if (numEscolhido < 0 || numEscolhido >= 100) {
            return 0;
        }

        if (vetor[numEscolhido] != 0 && Objects.equals(escolha, "S")) {
            boolResposta = 1;
        } else if (vetor[numEscolhido] == 0 && Objects.equals(escolha, "N")) {
            boolResposta = 2;
        }

        return boolResposta;
    }

    public static int mod(int num) {
        return (int) sqrt(num * num);
    }
}
