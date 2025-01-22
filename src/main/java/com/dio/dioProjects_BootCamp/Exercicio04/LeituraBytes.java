package com.dio.dioProjects_BootCamp.Exercicio04;

import java.io.*;

public class LeituraBytes {
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

    public static void copiarArquivo() throws IOException {
        File file = new File("C:\\Users\\Thiago Sandre\\IdeaProjects\\IO_Caracteres\\recomendações-copy.txt");
        String nameArchive = file.getName();

        BufferedInputStream bfi = new BufferedInputStream(new FileInputStream(file.getName()));

        String nameArchiveCopy = nameArchive.substring(0, nameArchive.indexOf("-")).concat("-copy2.txt");
        File copy = new File(nameArchiveCopy);

        BufferedOutputStream bfo = new BufferedOutputStream(new FileOutputStream(copy.getName()));

        int line = 0;
        while ((line = bfi.read()) != -1) {
            bfo.write((char) line);
            bfo.flush();
        };
        bfo.close();
        bfi.close();

        PrintStream printStream = new PrintStream(System.out);
        printStream.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes", copy.getName(), copy.getAbsolutePath(), copy.length());
    }
}
