package br.com.newton.upx;

import java.util.ArrayList;

public class Linha {

    private String linha;

    private static ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();

    public Linha(String linha) {
        this.linha = linha;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    //Método que acionado pelo botão de escolher. Adiciona um passageiro a lista de espera do ônibus.
    public void escolher(Passageiro passageiro){
        passageiros.add(passageiro);
    }

    //Método que acionado pelo botão de cancelar. Remove um passageiro da lista de espera do ônibus.
    public void cancelar(Passageiro passageiro){
        if (passageiros.size()>0){
            passageiros.remove(passageiro);
        }
    }

    //Método que mostra a quantidade de passageiros.
    public int imprimirPassageiros(){
        return passageiros.size();
    }
}