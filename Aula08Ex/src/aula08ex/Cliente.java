/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08ex;

/**
 *
 * @author Luan
 */
public class Cliente {
    //ATRIBUTOS
    private String nome, endereco;
    private long cpf;
    private float dinheiro;
    
    //MÉTODOS ESPECIAIS

    public Cliente(String nome, long cpf, String endereco, float dinheiro) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    
}

