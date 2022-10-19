package com.unesp.rc.model;

public class Player {
    int quantChutes, resposta, numEscolhido, numOcorrencias, pontos;
    String escolha;

    public Player(int quantChutes, int resposta, int numEscolhido, int numOcorrencias, int pontos, String escolha) {
        this.quantChutes = quantChutes;
        this.resposta = resposta;
        this.numEscolhido = numEscolhido;
        this.numOcorrencias = numOcorrencias;
        this.pontos = pontos;
        this.escolha = escolha;
    }

    public Player(int quantChutes) {
        this.quantChutes = quantChutes;
    }

    public int getQuantChutes() {
        return quantChutes;
    }

    public void setQuantChutes(int quantChutes) {
        this.quantChutes = quantChutes;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public int getNumEscolhido() {
        return numEscolhido;
    }

    public void setNumEscolhido(int numEscolhido) {
        this.numEscolhido = numEscolhido;
    }

    public int getNumOcorrencias() {
        return numOcorrencias;
    }

    public void setNumOcorrencias(int numOcorrencias) {
        this.numOcorrencias = numOcorrencias;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }
}
