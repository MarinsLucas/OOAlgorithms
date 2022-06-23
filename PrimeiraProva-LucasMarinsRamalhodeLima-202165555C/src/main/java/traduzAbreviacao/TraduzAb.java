//Lucas Marins Ramalho de Lima  mat: 202165555C
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traduzAbreviacao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TraduzAb {
    public static void main(String[] args) {
        //Criando HashMap
        Map<String, String> map = new HashMap<>();        
        map = criaHashMap();
        
        //scaneando palavra a ser traduzida
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite a frase a ser traduzida");
        String frase = keyb.nextLine();
        
        //separando palavras da frase
        List<String> frasePartida = stringStream(frase);
        String novaFrase[] = new String[frasePartida.size()];

        //traduzindo a frase
        for(int i=0; i<frasePartida.size();i++)
        {
            if(map.containsKey(frasePartida.get(i)))
            {
                novaFrase[i] = map.get(frasePartida.get(i));

            }
            else
            {
                novaFrase[i] = frasePartida.get(i);
            }
        }

        //imprimindo a frase traduzida
        for(int i=0;i<frasePartida.size();i++)
            System.out.print(novaFrase[i] + " ");
        System.out.println();

        keyb.close();
    }

    public static List<String> stringStream(String frase)
    {
        String[] frasePartida = frase.split(" ");
        List<String> palavrasList = Arrays.asList(frasePartida);

        return palavrasList;
    }

    public static Map<String,String> criaHashMap()
    {
        Map<String, String> map = new HashMap<>();        
        String palavra, abr;
        Scanner keyb = new Scanner(System.in);
        do  {
            System.out.println("Digite a abreviacao ou Fim para sair:");
            abr = keyb.next();
            if(!abr.equals("Fim"))
            {
                System.out.println("Digite o valor de "+ abr);
                palavra = keyb.next();
                map.put(abr, palavra);
            }
        }while(!abr.equals("Fim"));

        return map;
    }
