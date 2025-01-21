package com.dio.dioProjects_BootCamp.Exercicio03;


import java.io.*;

//Copie o arquivo com os 3 filmes recomendados e adicione mais três filmes ao arquivo.
public class CopiaFilmesAdicionarMaisTres {
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

    public static void copiarArquivo() throws IOException {
        //Selecionar o arquivo.
        File file = new File("C:\\Users\\Thiago Sandre\\IdeaProjects\\IO_Caracteres\\recomendações.txt");
        String nomeArquivo = file.getName();

        //Instanciando Buffer e lendo linhas dentro do arquivo.
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();

        //Criação da variavel responsável por adicionar o nome do arquivo.
        String nameArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");

        File fileCopy = new File(nameArquivoCopia);
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileCopy));
        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while (!(line == null));
        System.out.println("Arquivo copiado com sucesso! " + fileCopy.getName());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Adicione mais 3 filmes.");
        pw.flush();

        receberTresNovosFilmes(fileCopy.getName());

        bw.close();
        br.close();
        pw.close();
    }

    public static void receberTresNovosFilmes(String nomeArquivo) throws IOException {
        //Criação da instancia Buffer para receber novo filmes no console.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while (!line.equalsIgnoreCase("Fim"));

        br.close();
        bw.close();
    }
}
