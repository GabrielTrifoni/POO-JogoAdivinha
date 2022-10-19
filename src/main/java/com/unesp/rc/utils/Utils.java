package com.unesp.rc.utils;

import com.unesp.rc.model.Player;

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

    public static int verificaResposta(int[] vetor, Player jogador) {
        int boolResposta = 0;

        if (jogador.getNumEscolhido() < 0 || jogador.getNumEscolhido() >= 100) {
            return 0;
        }

        if (vetor[jogador.getNumEscolhido()] != 0 && Objects.equals(jogador.getEscolha(), "S")) {
            boolResposta = 1;
        } else if (vetor[jogador.getNumEscolhido()] == 0 && Objects.equals(jogador.getEscolha(), "N")) {
            boolResposta = 2;
        }

        return boolResposta;
    }

    public static int mod(int num) {
        return (int) sqrt(num * num);
    }
}
