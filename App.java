package AvaliacaoN1;
import java.util.Random;
import java.util.Scanner;
public class Ppt {
    static  Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        Random num = new Random();
        int maquina = 0;

         for(int i = 0; i < 1; i++) {
            maquina = num.nextInt(2)+1;
        }

       System.out.println("Escolha: 1/Pedra, 2/Papel, 3/Tesoura");
       int jogador = leia.nextInt();
      
       if(jogador == maquina){
           System.out.println("EMPATE");
       }else if(jogador == 1 && maquina == 2){
           System.out.println("DERROTA");
           System.out.println("Maquina: "+ maquina + " Jogador: " + jogador);
        }else if(jogador == 1 && maquina == 3){
            System.out.println("VITÓRIA");
            System.out.println("Maquina: "+ maquina + " Jogador: " + jogador);
        }else if(jogador == 2 && maquina == 1){
            System.out.println("VITÓRIA");
            System.out.println("Maquina: "+ maquina + " Jogador: " + jogador);
        }else if(jogador == 2 && maquina == 3){
            System.out.println("DERROTA");
            System.out.println("Maquina: "+ maquina + " Jogador: " + jogador);
        }else if(jogador == 3 && maquina == 1){
            System.out.println("DERROTA");
            System.out.println("Maquina: "+ maquina + " Jogador: " + jogador);
        }else if(jogador == 3 && maquina == 2){
            System.out.println("VITÓRIA");
            System.out.println("Maquina: "+ maquina + " Jogador: " + jogador);
       }else {
           System.out.println("Número invalido");
       }
    }
}