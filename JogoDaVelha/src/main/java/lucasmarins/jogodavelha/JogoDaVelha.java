/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.jogodavelha;

/**
 *
 * @author lucas
 */
public class JogoDaVelha {
    public static void main(String[] args) {
        BoasVindas bVindas = new BoasVindas();
        int gameMode = bVindas.modoDeJogo();
        
        if(gameMode == -1) return;
        Tabuleiro tabuleiro = new Tabuleiro();

        if(gameMode==0)
        {
            //Criar jogo contra bot
            tabuleiro.NovoJogador();
        }else
        {
            tabuleiro.NovoJogador();
            tabuleiro.NovoJogador();            
        }

        while(!tabuleiro.EndGame())
        {
            System.out.println("Nova Rodada");
            tabuleiro.rotina();
        }
       
        System.out.println("AAACABOU");
    }    
}
