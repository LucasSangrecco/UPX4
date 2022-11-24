package br.com.newton.upx;

import java.util.ArrayList;

public class Ponto {

    private String localizacao;
    private int qtdePassageiros=0;

    private ArrayList<Linha> linhas = new ArrayList<Linha>();

    public Ponto(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    //Método que adiciona linhas de ônibus ao ponto
    public void addLinha(Linha linha){
        linhas.add(linha);
    }

    //Método que aciona o sinal sonoro ao clicar em qualquer botão
    public String sinalSonoro(){
        return ("Sinal sonoro indicando que o botão foi acionado");
    }

    public String imprimirOnibus(){

        for(int i=0;i<linhas.size();i++) {
            Linha l1 = (Linha)linhas.get(i);
            qtdePassageiros = l1.imprimirPassageiros();
        }
        return "Passageiros aguardando no próximo ponto: " +  qtdePassageiros;
    }

    public String imprimirEmpresa(){
        String linha = "";
        for(int i=0;i<linhas.size();i++) {
             Linha l2 = (Linha)linhas.get(i);
                linha = l2.getLinha();
                qtdePassageiros = l2.imprimirPassageiros();
        }
        return "Ponto: " + getLocalizacao() + "\nLinha: " + linha + "\nQuantidade de passageiros aguardando: " + qtdePassageiros;
    }
}