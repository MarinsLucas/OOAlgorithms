/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.jogodavelha;

import lucasmarins.jogodavelha.BoasVindas;
/**
 *
 * @author lucas
 */
public class Jogador {
    char skin;
    String nome;
    
    public Jogador(String apelido)
    {
        BoasVindas bVindas = new BoasVindas();
        this.skin = bVindas.AskSkin(apelido) ;
        this.nome = bVindas.AskName(apelido);
    }

    public char getSkin()
    {
        return skin;
    }

    public String getNome()
    {
        return nome;
    }
    
}
