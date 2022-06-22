/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.sudoku;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Tabuleiro {
    int gridTabuleiro[][];
    int tam = 9;
    Random random;


    public Tabuleiro()
    {
        gridTabuleiro = new int[tam][tam];
        for(int i=0; i<tam; i++)
            for(int j=0;i<tam;i++)
                gridTabuleiro[i][j] = 0;

        random = new Random();
    }

    public void imprimeTabuleiro()
    {
        for(int i = 0; i<9;i++)
        {
            for(int j=0; j<9 ; j++)
            {
                System.out.print("| " + gridTabuleiro[i][j] + " |");
            }
            System.out.println();
        }
    }

    private void InsereValor(int linha, int coluna, int valor)
    {
        if(ValidaInsertion(linha, coluna, valor))
        {
            gridTabuleiro[linha][coluna] = valor;
        }
    }

    public void CriaTabuleiroAleatorio()
    {
        
        Scanner keyb = new Scanner(System.in);
        int quantNum = keyb.nextInt();
        Random random = extracted();
        int linha, coluna, valor;
        while(quantNum>0)
        {
            linha = random.nextInt(0,9);
            coluna = random.nextInt(0,9);

            if(gridTabuleiro[linha][coluna] == 0)
            {
                valor = random.nextInt(0,9);
                while(!ValidaInsertion(linha, coluna, valor)) valor = random.nextInt(0,9);
                InsereValor(linha, coluna, valor);
                quantNum--;
            }
        }
        imprimeTabuleiro();
        keyb.close();
    }

    private Random extracted() {
        Random random = new Random();
        return random;
    }

    public void CriaTabuleiroProgramavel()
    {
        Scanner keyb = new Scanner(System.in);
        int linha=0,coluna=0,valor=0;

        while(linha != -1 && coluna != -1 && valor != -1)
        {
            linha = keyb.nextInt();
            coluna = keyb.nextInt();
            valor = keyb.nextInt();
            if(ValidaInsertion(linha, coluna, valor))
                InsereValor(linha, coluna, valor);
            

            imprimeTabuleiro();
        }

        System.out.println("Final de programação do tabuleiro");

        keyb.close();
    }

    private boolean ValidaInsertion(int linha, int coluna, int valor)
    {
        if(linha < 0 || linha > tam || coluna < 0 || coluna > tam || valor < 1 || valor > 9)
            return false;
        for(int i=0; i<tam; i++)
        {
            if(gridTabuleiro[i][coluna] == valor) return false;
        }
        for(int j=0; j<tam; j++)
        {
            if(gridTabuleiro[linha][j] == valor) return false;
        }
        //TODO: testar se o quadrado de 3 possui o valor também
        return true;
    }

    public int getValor(int linha, int coluna)
    {
        return gridTabuleiro[linha][coluna];
    }   
    
    public void rotina(int linha, int coluna, int valor)
    {
        InsereValor(linha, coluna, valor);
        imprimeTabuleiro();
    }

    public boolean EndJogo()
    {
        for(int i = 0; i<tam; i++)
            for(int j=0; j<tam; j++)
                if(gridTabuleiro[i][j]==0) return false;
        return true;
    }
}
