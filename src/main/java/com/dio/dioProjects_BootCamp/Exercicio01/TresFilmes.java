package com.dio.dioProjects_BootCamp.Exercicio01;

import java.io.*;

//Abra o teclado para escrever 3 filmes que você recomendaria e exiba esse filmes no console.
public class TresFilmes {
    public static void main(String[] args) throws IOException {
        receberTeclaroImprimirConsole();
    }

    public static void receberTeclaroImprimirConsole() throws IOException {

        /*InputStream input = System.in;
        InputStreamReader inputReader = new InputStreamReader(input);
        BufferedReader br = new BufferedReader(inputReader);*/

        //FLUXO DE ENTRADA

        System.out.println("Recomende 3 filmes!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        //ENCERRAMENTO FLUXO DE ENTRADA

        //FLUXO DE SAIDA INICIO

        /*OutputStream os = System.out;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);*/
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = br.readLine();
        } while (!line.isEmpty());

        bufferedWriter.flush();
        br.close();
        bufferedWriter.close();
        //ENCERRAMENTO FLUXO DE SAIDA

    }
}