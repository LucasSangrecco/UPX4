package br.com.newton.upx;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private JButton escolhaA;
    private JButton cancelaA;
    private JButton escolhaB;
    private JButton cancelaB;
    private JButton escolhaC;
    private JButton cancelaC;
    private JButton escolhaD;
    private JButton cancelaD;

    public void janela() {
        JFrame frame = new JFrame("Painel de Escolha");

        JLabel onibusA = new JLabel("1111");
        escolhaA = new JButton("Escolher");
        cancelaA = new JButton("Cancelar");

        JLabel onibusB = new JLabel("2222");
        escolhaB = new JButton("Escolher");
        cancelaB = new JButton("Cancelar");

        JLabel onibusC = new JLabel("3333");
        escolhaC = new JButton("Escolher");
        cancelaC = new JButton("Cancelar");

        JLabel onibusD = new JLabel("4444");
        escolhaD = new JButton("Escolher");
        cancelaD = new JButton("Cancelar");
        JPanel painel = new JPanel();

        escolhaA.addActionListener(this);
        cancelaA.addActionListener(this);
        escolhaB.addActionListener(this);
        cancelaB.addActionListener(this);
        escolhaC.addActionListener(this);
        cancelaC.addActionListener(this);
        escolhaD.addActionListener(this);
        cancelaD.addActionListener(this);

        painel.add(onibusA);
        painel.add(escolhaA);
        painel.add(cancelaA);
        painel.add(onibusB);
        painel.add(escolhaB);
        painel.add(cancelaB);
        painel.add(onibusC);
        painel.add(escolhaC);
        painel.add(cancelaC);
        painel.add(onibusD);
        painel.add(escolhaD);
        painel.add(cancelaD);

        frame.getContentPane().add(painel);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        Ponto pontoA = new Ponto("Rua A,10 - Centro");
        Passageiro passageiro = null;

        //Não consegui resolver o problema do contador de passageiros de forma alguma.

        //Só consegui fazer o contador adicionar um passageiro a cada clique usando o Static no ArrayList<Passageiro> na classe Linha.
        //Como o static vale pra classe e não para o objeto, ao clicar para escolher uma linha, o contador permanece o mesmo para todas as linhas
        //O que não era o objetivo.
        //E por algum motivo não consigo fazer o cancelar remover um passageiro do ArrayList.

        for(int distanciaOnibus=10;distanciaOnibus>0;distanciaOnibus--) {

            if(evento.getSource() == escolhaA || evento.getSource() == cancelaA) {

                Linha linhaA = new Linha("1111");
                pontoA.addLinha(linhaA);

                if (evento.getSource() == escolhaA) {
                    passageiro = new Passageiro();
                    linhaA.escolher(passageiro);
                    JOptionPane.showMessageDialog(null, pontoA.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                    return;
                }

                if (evento.getSource() == cancelaA) {
                    linhaA.cancelar(passageiro);
                    JOptionPane.showMessageDialog(null, pontoA.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                    return;
                }
            }

            if(evento.getSource() == escolhaB || evento.getSource() == cancelaB) {

                Linha linhaB= new Linha("2222");
                pontoA.addLinha(linhaB);

                if (evento.getSource() == escolhaB) {
                    passageiro = new Passageiro();
                    JOptionPane.showMessageDialog(null, pontoA.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                    linhaB.escolher(passageiro);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                    return;
                }

                if (evento.getSource() == cancelaB) {
                    JOptionPane.showMessageDialog(null, pontoA.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                    linhaB.cancelar(passageiro);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                    return;
                }
            }

            if(evento.getSource() == escolhaC || evento.getSource() == cancelaC) {

                Linha linhaC = new Linha("3333");
                pontoA.addLinha(linhaC);

                if (evento.getSource() == escolhaC) {
                    passageiro = new Passageiro();
                    JOptionPane.showMessageDialog(null, pontoA.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                    linhaC.escolher(passageiro);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                    return;
                }

                if (evento.getSource() == cancelaC) {
                    JOptionPane.showMessageDialog(null, pontoA.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                    linhaC.cancelar(passageiro);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                    return;
                }
            }

            if(evento.getSource() == escolhaD || evento.getSource() == cancelaD) {

                Linha linhaD = new Linha("4444");
                pontoA.addLinha(linhaD);

                if (evento.getSource() == escolhaD) {
                    passageiro = new Passageiro();
                    JOptionPane.showMessageDialog(null, pontoA.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                    linhaD.escolher(passageiro);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                    return;
                }

                if (evento.getSource() == cancelaD) {
                    JOptionPane.showMessageDialog(null, pontoA.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                    linhaD.cancelar(passageiro);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, pontoA.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.janela();

    }
}
