/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.sudoku;

import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class BoasVindas {
    public BoasVindas()
    {

    }

    public int TelaBoaVinda()
    {
        String mensagem = "Bem vindo ao Sudoku! Escolha uma opção:";
        String options[] = {"TabuleiroAleatório", "TabuleiroConfigurável"};
        int option = JOptionPane.showOptionDialog(null, mensagem, "Sudoku", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        return option;
    }
}
