package br.com.newton.upx;

public class Linha {

    private String linha;
    public static int contPassageiros;

    public Linha(String linha) {
        this.linha = linha;
    }

    public String getLinha() {

        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String sinalSonoro(){

        return ("Sinal sonoro indicando que o botão foi acionado");
    }
    public void escolher(){
        contPassageiros++;
    }
    public void cancelar(){
        if(contPassageiros>0)
            contPassageiros--;
    }
    public String imprimirOnibus(){
        return "Passageiros aguardando no próximo ponto: " + contPassageiros;
    }
    public String imprimirEmpresa(){
        return "\nLinha: " + getLinha() + "\nPassageiros aguardando: " + contPassageiros;
    }

}