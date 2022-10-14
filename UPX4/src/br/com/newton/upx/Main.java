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
        Linha linhaA = new Linha("1111");
        Linha linhaB = new Linha("2222");
        Linha linhaC = new Linha("3333");
        Linha linhaD = new Linha("4444");

        for(int i=10; i>0;i--) {
            if (evento.getSource() == escolhaA) {
                JOptionPane.showMessageDialog(null, linhaA.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                linhaA.escolher();
                JOptionPane.showMessageDialog(null, linhaA.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                JOptionPane.showMessageDialog(null, pontoA.imprimirPonto() + linhaA.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                return;
            }
            if (evento.getSource() == cancelaA) {
                JOptionPane.showMessageDialog(null, linhaA.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                linhaA.cancelar();
                JOptionPane.showMessageDialog(null, linhaA.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                JOptionPane.showMessageDialog(null, pontoA.imprimirPonto() + linhaA.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                return;
            }
            if (evento.getSource() == escolhaB) {
                JOptionPane.showMessageDialog(null, linhaB.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                linhaB.escolher();
                JOptionPane.showMessageDialog(null, linhaB.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                JOptionPane.showMessageDialog(null, pontoA.imprimirPonto() + linhaB.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                return;
            }
            if (evento.getSource() == cancelaB) {
                JOptionPane.showMessageDialog(null, linhaB.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                linhaB.cancelar();
                JOptionPane.showMessageDialog(null, linhaB.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                JOptionPane.showMessageDialog(null, pontoA.imprimirPonto() + linhaB.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                return;
            }
            if (evento.getSource() == escolhaC) {
                JOptionPane.showMessageDialog(null, linhaC.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                linhaC.escolher();
                JOptionPane.showMessageDialog(null, linhaC.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                JOptionPane.showMessageDialog(null, pontoA.imprimirPonto() + linhaC.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                return;
            }
            if (evento.getSource() == cancelaC) {
                JOptionPane.showMessageDialog(null, linhaC.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                linhaC.cancelar();
                JOptionPane.showMessageDialog(null, linhaC.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                JOptionPane.showMessageDialog(null, pontoA.imprimirPonto() + linhaC.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                return;
            }
            if (evento.getSource() == escolhaD) {
                JOptionPane.showMessageDialog(null, linhaD.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                linhaD.escolher();
                JOptionPane.showMessageDialog(null, linhaD.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                JOptionPane.showMessageDialog(null, pontoA.imprimirPonto() + linhaD.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                return;
            }
            if (evento.getSource() == cancelaD) {
                JOptionPane.showMessageDialog(null, linhaD.sinalSonoro(), "Som", JOptionPane.DEFAULT_OPTION);
                linhaD.cancelar();
                JOptionPane.showMessageDialog(null, linhaD.imprimirOnibus(), "Ônibus", JOptionPane.DEFAULT_OPTION);
                JOptionPane.showMessageDialog(null, pontoA.imprimirPonto() + linhaD.imprimirEmpresa(), "Empresa", JOptionPane.DEFAULT_OPTION);
                return;
            }

        }

    }

    public static void main(String[] args) {

        Main main = new Main();
        main.janela();

    }

}