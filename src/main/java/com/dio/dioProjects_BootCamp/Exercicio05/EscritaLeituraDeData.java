package com.dio.dioProjects_BootCamp.Exercicio05;

import java.io.*;
import java.util.Scanner;

public class EscritaLeituraDeData {
    public static void main(String[] args) throws IOException {
        incluirProduto();
    }

    public static void incluirProduto() throws IOException {
        File file = new File("C:\\Users\\Thiago Sandre\\IdeaProjects\\IO_Caracteres\\src\\main\\java\\com\\dio\\dioProjects_BootCamp\\Exercicio05\\peca-roupa.bin");

        PrintStream printStream = new PrintStream(System.out, true);

        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(file.getPath()));

        Scanner scanner = new Scanner(System.in);

        printStream.println("Nome do produto: ");
        String nome = scanner.nextLine();
        dataOut.writeUTF(nome);

        printStream.println("Tamanho do produto (G/M/P): ");
        char tamanho = (char) System.in.read();
        dataOut.writeChar(tamanho);

        printStream.println("Quantidade: ");
        int quantidade = scanner.nextInt();
        dataOut.writeInt(quantidade);

        printStream.println("Preço: ");
        double preco = scanner.nextDouble();
        dataOut.writeDouble(preco);

        lerProduto(file.getPath());

        printStream.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes", file.getName(), file.getAbsolutePath(), file.length());

        dataOut.close();
        printStream.close();
        scanner.close();


    }

    public static void lerProduto(String caminhoArquivo) throws IOException {
        File file = new File(caminhoArquivo);

        DataInputStream dataOut = new DataInputStream(new FileInputStream(file.getPath()));

        String nome = dataOut.readUTF();
        char tamanho = dataOut.readChar();
        int quantidade = dataOut.readInt();
        double preco = dataOut.readDouble();

        System.out.printf("\nNome...............: %s\n", nome);
        System.out.printf("\nTamanho...............: %s\n", tamanho);
        System.out.printf("\nQuantidade...............: %s\n", quantidade);
        System.out.printf("\nPreço...............: %s\n", preco);
        System.out.println("Preço total: " + (quantidade * preco));
    }
}
