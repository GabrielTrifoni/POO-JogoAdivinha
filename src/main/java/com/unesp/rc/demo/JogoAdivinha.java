package com.unesp.rc.demo;

import com.unesp.rc.input.Input;
import com.unesp.rc.model.Player;
import com.unesp.rc.utils.Utils;

public class JogoAdivinha {
    public static void main(String[] args) {
        int quantRodadas = 5;
        int[] vetor;

        Player jogador = new Player(5);

        for (int i = 1; i <= quantRodadas; i++) {
            System.out.println("*----------------*\nRodada " + i + "!!\n*----------------*\n");

            jogador.setQuantChutes(5);

            vetor = Utils.criaVetor();
            //System.out.println("Vetor: " + Arrays.toString(vetor));

            System.out.print("Digite um numero (de 0 a 99): ");
            jogador.setNumEscolhido(Input.lerInt());

            System.out.print("Vc acha que o numero esta na lista?\n(S/N): ");
            jogador.setEscolha(Input.lerString());

            jogador.setResposta(Utils.verificaResposta(vetor, jogador));

            if (jogador.getResposta() == 1 || jogador.getResposta() == 2) {
                System.out.println("Sim, o numero esta na lista!");
            } else {
                System.out.println("Errou... Ele nao estava na lista");
            }

            if (jogador.getResposta() == 1) {
                do {
                    System.out.print("Quantas vezes vc acha que o numero aparece na lista? (" + jogador.getQuantChutes() + " chutes): ");
                    jogador.setNumOcorrencias(Input.lerInt());

                    if (Utils.mod(jogador.getNumOcorrencias() - vetor[jogador.getNumEscolhido()]) >= 26) {
                        System.out.println("Esta congelando...");
                    } else if (Utils.mod(jogador.getNumOcorrencias() - vetor[jogador.getNumEscolhido()]) >= 12) {
                        System.out.println("Esta frio.");
                    } else if (Utils.mod(jogador.getNumOcorrencias() - vetor[jogador.getNumEscolhido()]) >= 5) {
                        System.out.println("Esta esquentando!");
                    } else if (Utils.mod(jogador.getNumOcorrencias() - vetor[jogador.getNumEscolhido()]) >= 1) {
                        System.out.println("Esta quente!!!!");
                    } else {
                        System.out.println("Acertou!!!");
                        jogador.setPontos(jogador.getPontos() + 1);
                        break;
                    }
                    jogador.setQuantChutes(jogador.getQuantChutes() - 1);
                } while (jogador.getQuantChutes() > 0);
            }

            if (jogador.getQuantChutes() == 0) {
                System.out.println("Errou... Ele aparecia " + vetor[jogador.getNumEscolhido()] + " vezes");
            }
        }

        System.out.println("Vc fez " + jogador.getPontos() + "/5 pontos");
    }
}
