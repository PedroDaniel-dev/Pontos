package main;

import arvbin.AVL;
import ponto.Ponto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Forneça o nome do arquivo TXT de entrada");
            return;
        }

        String fileName = args[0];

        // Implemente o seu código a partir daqui!
        // Abra o arquivo para ler os dados e não se esqueça de fechá-lo
        int numeroPontos = 0;
        int k = 0;
        try (Scanner sc = new Scanner(new File(fileName))){
            k = sc.nextInt();

            for(int i = 0; i < k; i++){
                AVL<Ponto, Ponto> arvore = new AVL<>();

                int menorX = Integer.MAX_VALUE;
                int menorY = Integer.MAX_VALUE;
                int maiorX = Integer.MIN_VALUE;
                int maiorY = Integer.MIN_VALUE;
                numeroPontos = sc.nextInt();

                for(int j = 0; j < numeroPontos; j++) {
                    Ponto ponto = new Ponto(sc.nextInt(), sc.nextInt());
                    if (ponto.getX() < menorX) menorX = ponto.getX();
                    if (ponto.getX() > maiorX) maiorX = ponto.getX();
                    if (ponto.getY() < menorY)  menorY = ponto.getY();
                    if (ponto.getY() > maiorY) maiorY = ponto.getY();
                    arvore.inserir(ponto);
                }
                arvore.emOrdem(ponto ->  {
                    System.out.print("(" + ponto.getX() + ", " + ponto.getY() + ") ");
                });
                System.out.println("\n(" + menorX + ", " + maiorY + ") (" + maiorX + ", " + menorY + ")\n");

            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}
