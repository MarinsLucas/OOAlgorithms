/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.jogodavelha;

import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class BoasVindas {
    public BoasVindas()
    {

    }

    public int modoDeJogo()
    {
        String mensagem = "Bem vindo ao Jogo da Velha! Escolha um modo de jogo:";
        String options[] = {"PxCPU", "PvP"};
        int option = JOptionPane.showOptionDialog(null, mensagem, "Jogo da Velha", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        return option;
    }

    public String AskName(String jogador)
    {
        String nome = JOptionPane.showInputDialog(null, "Insira nome do " + jogador);
        return nome;
    }
    
    public char AskSkin(String jogador)
    {
        String skin = JOptionPane.showInputDialog(null, "Insira um caractere para o " + jogador);
        return skin.charAt(0);
    }
}
