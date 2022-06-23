//Lucas Marins Ramalho de Lima  mat: 202165555C
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.primeiraprova.lucasmarinsramalhodelima.c;

/**
 *
 * @author lucas
 */
public class Movimento {
    char direcao;
    int deslocamento;

    public Movimento(char direcao, int deslocamento)
    {
        this.direcao = direcao;
        this.deslocamento = deslocamento;
    }

    public int getDeslocamento()
    {
        return deslocamento; 
    }

    public char getDirecao()
    {
        return direcao;
    }
    
}
