/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07teste;

/**
 *
 * @author Luan
 */
public class Produto implements InterProduto{
    //Atributos
    private int Codigo;
    private String modelo;
    private String nome;
    private float valor;
    private boolean disponivel;
    
    //Métodos Especiais
    
    public Produto(int Codigo, String modelo, String nome, float valor, boolean disponivel) {
        this.Codigo = Codigo;
        this.modelo = modelo;
        this.nome = nome;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    //Métodos Públicos

    @Override
    public void alterValor(float v) {
        this.setValor(v);
    }

    @Override
    public void alterarNome(String n) {
        this.setNome(n);
    }

    @Override
    public void excluirProd() {
        this.setCodigo(0);
        this.setNome(null);
        this.setModelo(null);
        this.setDisponivel(false);
        this.setValor(0);
        System.out.println("Produto Excluido.");
    }
    public void apresentarProtudo(){
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Nome: " + this.getNome());
        System.out.printf("Valor: %.3f \n", this.getValor());
        System.out.println("Disponivel: " + this.isDisponivel());
    }
}
