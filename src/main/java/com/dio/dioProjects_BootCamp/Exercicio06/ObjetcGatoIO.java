package com.dio.dioProjects_BootCamp.Exercicio06;


import com.dio.dioProjects_BootCamp.Exercicio06.Domain.Gato;

import java.io.*;

//Crie a classe Gato com os atributos nome, idade e cor.
//Instancie o Objeto e serialize
//Desserialize este objeto e mostre no console
public class ObjetcGatoIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialize a classe e salve o arquivo.
        //serializacao();
        //Só irá funcionar se a serialização estiver comentada, pois assim ela irá fazer a desserialização
        desserializacao("src/main/java/com/dio/dioProjects_BootCamp/Exercicio06/gato");
    }

    public static void serializacao() throws IOException, ClassNotFoundException {
        Gato gato = new Gato("Mel", 6, "Laranja", true, false);

        File file = new File("C:\\Users\\Thiago Sandre\\IdeaProjects\\IO_Caracteres\\src\\main\\java\\com\\dio\\dioProjects_BootCamp\\Exercicio06\\gato");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file.getPath()));

        out.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes", file.getName(), file.getAbsolutePath(), file.length());

        out.close();
        ps.close();
    }

    public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objetoGato = (Gato) in.readObject();

        System.out.printf("\nNome: %s", objetoGato.getNome());
        System.out.printf("\nIdade: %s", objetoGato.getIdade());
        System.out.printf("\nCor: %s", objetoGato.getCor());
        System.out.printf("\nCastrado: %s", objetoGato.isCastrado());
        System.out.printf("\nRonrona: %s", objetoGato.isRonrona());
        System.out.printf("\nUUID: %s\n", objetoGato.getUUID());
        System.out.println(objetoGato);

        in.close();
    }
}
