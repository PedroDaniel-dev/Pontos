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
        AVL<Ponto, Ponto> arvore = new AVL<>();
        // Abra o arquivo para ler os dados e não se esqueça de fechá-lo
        int numeroPontos = 0;
        int k = 0;
        try{
            Scanner sc = new Scanner(new File(fileName));
            k = sc.nextInt();
            for(int i = 0; i < k; i++){
                numeroPontos = sc.nextInt();
                for(int i = 0; i < numeroPontos; i++) {
                    arvore.inserir(Ponto ponto = new Ponto(sc.nextLine()));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
    }
}
