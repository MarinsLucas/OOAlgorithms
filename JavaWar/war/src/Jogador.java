package JavaWar;
package war;
import java.util.Scanner;

public class Jogador {
        private int hp;
        private String name;
        private double atk;
        private double def;
        private int playerAxis[];
        private int exp;
        private int nivel;

        public Jogador(){
            this.vida = 5;
            this.exp = 1;
            this.nivel = 1;
            def = nivel * Math.pow(exp, 2);
            atk = 2 * exp * Math.pow(nivel,2);
        }

        public void playerName(){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Insira seu nome: ");
            String name = teclado.nextLine();
            this.name = name;
        }

        public int getHp(){
            return this.hp;
        }

        public void setAxis(int [] axis){
            this.playerAxis = axis;
        }

        public void imprime(){
            System.out.println("Nome: "+this.name+"\nPosição: ("+this.playerAxis[0]+
            ","+playerAxis[1]+")"+"\nPontos de Vida: "
            +this.hp+"\nNível: "+this.nivel+"\nExperiência: "+this.exp+
            "\nForça de defesa: "+this.def+"\nForça de ataque: "+this.atk);

        }

}
