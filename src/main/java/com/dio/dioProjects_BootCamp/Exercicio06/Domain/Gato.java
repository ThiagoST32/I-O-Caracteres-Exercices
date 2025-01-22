package com.dio.dioProjects_BootCamp.Exercicio06.Domain;

import java.io.Serial;
import java.io.Serializable;

public class Gato implements Serializable {
    @Serial //SERIE FINAL DA SERIALIZAÇÃO
    private static final long serialVersionUID = 2L;
    protected String nome;
    protected int idade;
    protected String cor;
    protected boolean isCastrado;
    //ATRIBUTO INVISIVEL, NÃO CONTRUBUI E NÃO FLUI
    protected transient boolean ronrona;

    public Gato(){
    }

    public Gato(String nome, int idade, String cor, boolean isCastrado, boolean ronrona) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.isCastrado = isCastrado;
    }

    public Long getUUID(){
        return serialVersionUID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCastrado() {
        return isCastrado;
    }

    public void setCastrado(boolean castrado) {
        isCastrado = castrado;
    }

    public boolean isRonrona() {
        return ronrona;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", isCastrado=" + isCastrado +
                ", ronrona=" + ronrona +
                '}';
    }
}
