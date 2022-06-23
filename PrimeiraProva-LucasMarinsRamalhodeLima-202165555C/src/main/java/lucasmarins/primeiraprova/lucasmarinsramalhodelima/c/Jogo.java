//Lucas Marins Ramalho de Lima  mat: 202165555C
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.primeiraprova.lucasmarinsramalhodelima.c;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import lucasmarins.primeiraprova.lucasmarinsramalhodelima.c.Tabuleiro;

/**
 *
 * @author lucas
 */
public class Jogo {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int ordemTab, quantMovimentos;
        System.out.println("Por favor, insira a ordem do tabuleiro: ");
        ordemTab = keyb.nextInt();
        System.out.println("Por favor, insira a quantidade de movimentos: ");
        quantMovimentos = keyb.nextInt();

        Tabuleiro tabuleiro = new Tabuleiro(ordemTab);

        char direcao;
        int deslocamento;
        List<Movimento> movimentos = new LinkedList<>();
        for(int i=0;i<quantMovimentos;i++)
        {
            System.out.println("Movimento " + i);
            System.out.println("Direção do movimento (c, b, d, e): ");
            direcao = keyb.next().charAt(0);
            System.out.println("Deslocamento do movimento: ");
            deslocamento = keyb.nextInt();
            movimentos.add(new Movimento(direcao, deslocamento));         
        }
        System.out.println("\n===Simulação===");
        for(int i =0;i<quantMovimentos;i++)
        {
            if(!tabuleiro.Movimentar(movimentos.get(i)))
            {
                tabuleiro.ImprimeTabuleiro();
                System.out.println("Fim de Jogo!");
                System.out.println("Personagem saiu do tabuleiro!");
                break;
            }
            else
            {
                System.out.println("Movimento (" + movimentos.get(i).getDirecao() +"," + movimentos.get(i).getDeslocamento()+"): ");
                tabuleiro.ImprimeTabuleiro();
                tabuleiro.ImprimeJogador();
                System.out.println("Deslocamento relativa: " + tabuleiro.deslocamentoRelativo());
            }
        }
        keyb.close();    
    }
}
