package JavaWar;
import java.util.*;
package war;
public class Tabuleiro {
        private String gametable [][];
        private int N;
        private int contT;
        private List<Jogador> jogadores;

        public Tabuleiro(int size){
            this.N = size;
            gametable = new String[N][N];
            contT = 10;
            Random rand = new Random();
            int nX =0,nY =0;

            Jogador jogador1 = new Jogador();
            Jogador jogador2 = new Jogador();

            jogadores.add(jogador1);
            jogadores.add(jogador2);

            System.out.println("Insira seu nome! (Jogador 1)");
            jogadores.get(0).playerName();
            System.out.println("Insira seu nome! (Jogador 2)");
            jogadores.get(1).playerName();
            

            for(int i = 0; i < N; i++)
                for(int j = 0; j < N;j++)
                    gametable[i][j]=" ";
            
            //player1 axis
            nX = rand.nextInt(N);
            nY = rand.nextInt(N);
            
            gametable[nX][nY] = "J1";

            int [] vecAux = new int[2];

            vecAux[0] = nX;
            vecAux[1] = nY;

            jogadores.get(0).setAxis(vecAux);
             //player2 axis
             nX = rand.nextInt(N);
             nY = rand.nextInt(N);

             if(gametable[nX][nY].equals("J1") == false){
                gametable[nX][nY] = "J2";
                vecAux[0] = nX;
                vecAux[1] = nY;

                jogadores.get(1).setAxis(vecAux);
             } else {
                nX = rand.nextInt(N);
                nY = rand.nextInt(N);
                gametable[nX][nY] = "J2";
                vecAux[0] = nX;
                vecAux[1] = nY;

                jogadores.get(1).setAxis(vecAux);
             }
             int i = 0;
             while(i <= contT){
                nX = rand.nextInt(N);
                nY = rand.nextInt(N);
                if((gametable[nX][nY].equals("T") == false) && (gametable[nX][nY].equals(" ") == true)){
                    gametable[nX][nY] = "T";
                    i++;
                }

             }

             for (Jogador player : jogadores) {
                player.imprime();
             }
             
            generateTable();
        }
        private void generateTable(){
            System.out.println("------------------Tabuleiro------------------");
            for(int i=0;i<N;i++){
                for(int j=0; j<N;j++)
                    System.out.print("| "+gametable[i][j]+" |");
                System.out.println();
            }
        }
}
