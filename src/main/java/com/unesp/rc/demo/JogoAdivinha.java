package com.unesp.rc.demo;

import com.unesp.rc.input.Input;
import com.unesp.rc.utils.Utils;

public class JogoAdivinha {
    public static void main(String[] args) {
        int quantRodadas = 5, quantChutes, resposta, numEscolhido, numOcorrencias, pontos = 0;
        int[] vetor;

        for (int i = 1; i <= quantRodadas; i++) {
            System.out.println("*----------------*\nRodada " + i + "!!\n*----------------*\n");

            quantChutes = 5;
            vetor = Utils.criaVetor();
            //System.out.println("Vetor: " + Arrays.toString(vetor));

            System.out.print("Digite um numero (de 0 a 99): ");
            numEscolhido = Input.lerInt();

            System.out.print("Vc acha que o numero esta na lista?\n(S/N): ");
            String escolha = Input.lerString();

            resposta = Utils.verificaResposta(vetor, numEscolhido, escolha);

            if (resposta == 1 || resposta == 2) {
                System.out.println("Sim, o numero esta na lista!");
            } else {
                System.out.println("Errou... Ele estava na lista");
            }

            if (resposta == 1) {
                do {
                    System.out.print("Quantas vezes vc acha que o numero aparece na lista? (" + quantChutes + " chutes): ");
                    numOcorrencias = Input.lerInt();

                    if (Utils.mod(numOcorrencias - vetor[numEscolhido]) >= 26) {
                        System.out.println("Esta congelando...");
                    } else if (Utils.mod(numOcorrencias - vetor[numEscolhido]) >= 12) {
                        System.out.println("Esta frio.");
                    } else if (Utils.mod(numOcorrencias - vetor[numEscolhido]) >= 5) {
                        System.out.println("Esta esquentando!");
                    } else if(Utils.mod(numOcorrencias - vetor[numEscolhido]) >= 1){
                        System.out.println("Esta quente!!!!");
                    } else {
                        System.out.println("Acertou!!!");
                        pontos++;
                        break;
                    }
                    quantChutes--;
                } while(quantChutes > 0);
            }

            if(quantChutes == 0){
                System.out.println("Errou... Ele aparecia " + vetor[numEscolhido] + " vezes");
            }
        }

        System.out.println("Vc fez " + pontos + "/5 pontos");
    }
}
