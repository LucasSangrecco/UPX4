package br.com.newton.upx;

public class Linha {

    private String linha;
    private int contPassageiros;

    public Linha(String linha, int contPassageiros) {
        this.linha = linha;
        this.contPassageiros = contPassageiros;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }
    public int getContPassageiros() {
        return contPassageiros;
    }

    public void setContPassageiros(int contPassageiros) {
        this.contPassageiros = contPassageiros;
    }
    public String sinalSonoro(){
        return ("Sinal sonoro indicando que o botão foi acionado");
    }
    public void isEscolher(){
            this.contPassageiros++;
    }
    public void isCancelar(){
        if(getContPassageiros()>0)
            this.contPassageiros--;
    }
    public String imprimirOnibus(){
        return "Passageiros aguardando no próximo ponto: " + getContPassageiros();
    }
    public String imprimirEmpresa(){
        return "\nLinha: " + getLinha() + "\nPassageiros aguardando: " + getContPassageiros();
    }

}
