package br.com.newton.upx;

public class Ponto {

    private String localizacao;

    public Ponto(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String imprimirPonto(){
        return "Ponto: " + getLocalizacao();
    }

}