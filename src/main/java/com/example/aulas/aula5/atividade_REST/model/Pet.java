package com.example.aulas.aula5.atividade_REST.model;

public class Pet {

    String nome;
    String especie;
    int idade;

    public Pet() { };

    public Pet(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

}
