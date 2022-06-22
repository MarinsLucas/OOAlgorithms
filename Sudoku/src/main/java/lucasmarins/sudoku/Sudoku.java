/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.sudoku;

import lucasmarins.sudoku.BoasVindas;
import lucasmarins.sudoku.Tabuleiro;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Sudoku {
    public static void main(String[] args) {
        BoasVindas inicio = new BoasVindas();
        int option = inicio.TelaBoaVinda();
        
        if(option== -1)
        {
            return;
        }
        
        Tabuleiro tabuleiro = new Tabuleiro();

        if(option==0)
            tabuleiro.CriaTabuleiroAleatorio();
        else
            tabuleiro.CriaTabuleiroProgramavel();
        
        byte linha = -1, coluna=-1, valor=-1;
        Scanner keyb = new Scanner(System.in);
        while(!tabuleiro.EndJogo())
        {
            //FINGE QUE LINHA, COLUNA E VALOR ESTÃO SENDO LIDOS AQUI
            tabuleiro.rotina(linha, coluna, valor);
        }
        keyb.close();
    }
}
