//Lucas Marins Ramalho de Lima  mat: 202165555C

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.primeiraprova.lucasmarinsramalhodelima.c;

import lucasmarins.primeiraprova.lucasmarinsramalhodelima.c.Movimento;
/**
 *
 * @author lucas
 */
public class Tabuleiro {
    int ordem;
    char grid[][];

    int x;
    int y;

    public Tabuleiro(int tam)
    {
        this.ordem = tam;
        grid = new char[tam][tam];

        for(int i=0;i<tam;i++)
            for(int j=0;j<tam; j++)
                grid[i][j] = '*';
        x =0;
        y =0;
    }
    
    public boolean Movimentar(Movimento movimento)
    {
        grid[x][y] = '*';
        switch(movimento.getDirecao())
        {
            case 'c': 
                x -=movimento.getDeslocamento();
                break;
            case 'b':
                x +=movimento.getDeslocamento();
                break;
            case 'd':
                y +=movimento.getDeslocamento();
                break;
            case 'e':
                y -=movimento.getDeslocamento();
                break;
            default:
                System.out.println("Entrada de movimento incompatível");
                break;
        }

        if(x >= ordem || y >= ordem || x < 0 || y < 0)
            return false;

        grid[x][y] = 'P';

        return true;
    }

    public double deslocamentoRelativo()
    {
        return Math.sqrt(x*x + y*y);
    }

    public void ImprimeTabuleiro()
    {
        for(int i=0;i<ordem;i++)
        {
            for(int j=0;j<ordem;j++)
            {
                System.out.print(" " + grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void ImprimeJogador()
    {
        System.out.println("Posicao atual: (" + x + "," + y + ")");
    }

}
