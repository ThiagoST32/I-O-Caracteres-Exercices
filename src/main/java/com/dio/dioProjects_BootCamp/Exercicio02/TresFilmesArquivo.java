package com.dio.dioProjects_BootCamp.Exercicio02;

import java.io.*;
import java.util.Scanner;

//Abra o teclado para escrever 3 filmes que você recomendaria e exiba esse filmes no console e crie um arquivo.txt com os nomes.
public class TresFilmesArquivo {
    public static void main(String[] args) throws IOException {
        receberFilmesEscritosConsole();
    }

    public static void receberFilmesEscritosConsole() throws IOException {
        //Fluxo aberto para escrever no console oque foi escrito.
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Digite 3 filmes: ");

        //Ler oque foi digitado.
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        //Inicialização da classe File.
        File file = new File("recomendações.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = scanner.nextLine();
        } while (!line.equalsIgnoreCase("Fim"));

        pw.printf("Arquivo \"%s\" foi criado com sucesso", file.getName());
        pw.close();
        scanner.close();
        bw.close();
    }
}
