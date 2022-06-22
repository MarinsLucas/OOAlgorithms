package JavaWar;
package war;
import java.util.Scanner;

public class Jogo {
        public static void main(String[] args) {
            int tam =0;
            Scanner teclado = new Scanner(System.in);

            System.out.println("Insira a ordem do tabuleiro: ");

            tam = teclado.nextInt();

            Tabuleiro jogo = new Tabuleiro(tam);

            

        }
        
}


