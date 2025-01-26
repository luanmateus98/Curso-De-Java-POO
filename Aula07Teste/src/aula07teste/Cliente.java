/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07teste;

/**
 *
 * @author Luan
 */
public class Cliente {
    //Atributos
    private String nome, endereço;
    private int cpf;
    private float limiteCartão;
    private Produto prod;
    
    //Métodos Especiais
    public Cliente(String nome, String endereço, int cpf, float limiteCartão) {
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.limiteCartão = limiteCartão;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public float getLimiteCartão() {
        return limiteCartão;
    }

    public void setLimiteCartão(float limiteCartão) {
        this.limiteCartão = limiteCartão;
    }
    
    //Métodos Públics
    public void adicionarLimite(float v){
        this.setLimiteCartão(v);
    }
    public void tirarLimite(float v){
        if (this.getLimiteCartão() <= this.prod.getValor()) {
            this.setLimiteCartão(v);
        } else {
            System.out.println("Limite indisponível");
        }
        
    }
    public void statusCliente(){
        System.out.println("Cliente: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereço());
        System.out.println("CPF: " + this.getCpf());
        System.out.printf("Limite do cartão disponível: %.3f \n", this.getLimiteCartão());
    }
}
