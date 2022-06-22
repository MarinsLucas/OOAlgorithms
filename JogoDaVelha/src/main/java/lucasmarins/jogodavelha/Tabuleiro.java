/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.jogodavelha;

import javax.swing.JOptionPane;

import lucasmarins.jogodavelha.Jogador;
import java.util.Random;
/**
 *
 * @author lucas
 */
public class Tabuleiro {
    char gridTabuleiro[][];
    String options[] = {"1", "2", "3"};
    Jogador P1;
    Jogador P2;
    Random random; 

    public Tabuleiro()
    {
        gridTabuleiro = new char[3][3];
        for(int i =0;i<3;i++)
            for(int j=0;j<3;j++)
                gridTabuleiro[i][j] = ' ';

        random = new Random();
    }
    
    public void ImprimeTabuleiro()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print("| " + gridTabuleiro[i][j] + " |");
            System.out.println("\n_______________");
        }
    }

    public void InsereValor(int linha, int coluna, Jogador jogador)
    {
        if(jogador == null)
            if(validaEntrada(linha, coluna))
                gridTabuleiro[linha][coluna] = 'Ç';

        if(validaEntrada(linha, coluna))
            gridTabuleiro[linha][coluna] = jogador.getSkin();
    }

    private boolean validaEntrada(int linha, int coluna)
    {
        if(linha < 0 || linha >= 3 || coluna < 0 || coluna >=3) 
            return false;
        else
            return (gridTabuleiro[linha][coluna] == ' ');
    }

    public void NovoJogador()
    {
        if(P1 == null)
            P1 = new Jogador("P1");
        else if(P2 == null)
            P2 = new Jogador("P2");
        else
            System.out.println("Limite de jogadores excedido");
    }

    

    public void rotina()
    {
        int linha = -1;
        int coluna = -1;
        while(!validaEntrada(linha, coluna))
        {
            linha = JOptionPane.showOptionDialog(null, P1.getNome() + " jogue uma linha", P1.getNome(), JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            coluna = JOptionPane.showOptionDialog(null, P1.getNome() + " jogue uma coluna", P1.getNome(), JOptionPane.OK_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        }
        this.InsereValor(linha, coluna, P1);
        this.ImprimeTabuleiro();
        linha = -1;
        coluna = -1;

        if(P2 != null)
        {
            while(!validaEntrada(linha, coluna))
            {
                linha = JOptionPane.showOptionDialog(null, P2.getNome() + " jogue uma linha", P2.getNome(), JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                coluna = JOptionPane.showOptionDialog(null, P2.getNome() + " jogue uma coluna", P2.getNome(), JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            }
            InsereValor(linha, coluna, P2);
        }
        else
        {
            while(!validaEntrada(linha, coluna))
            {
                linha = random.nextInt(0,3);
                coluna = random.nextInt(0,3);
            }
            InsereValor(linha, coluna, null);
        }
        this.ImprimeTabuleiro();        
    }

    public boolean EndGame()
    {
        char skin = P1.getSkin();
        int j;
        //Vitória por linha
        for(int i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(gridTabuleiro[i][j] != skin) break;
            }
            if(j>=2) return true;
        }
        //Vitória por coluna
        for(int i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(gridTabuleiro[j][i] != skin) break;
            }
            if(j>=2) return true;
        }

        if(P2==null)
            skin = 'Ç';
        else
            skin = P2.getSkin();

        //Vitória por linha
        for(int i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(gridTabuleiro[i][j] != skin) break;
            }
            if(j>=2) return true;
        }
        //vitoria por coluna
        for(int i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(gridTabuleiro[j][i] != skin) break;
            }
            if(j>=2) return true;
        }
        
        //caso de velha
        for(int i =0; i<3;i++)
            for(j=0;j<3;j++)
                if(gridTabuleiro[i][j] == ' ') return false;
        return true;
    }
}
