/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06segtentativa;

/**
 *
 * @author Luan
 */
public class Produtos implements InterfProduto {
    private int codigo;
    private String modelo;
    private String nome;
    private String tamanho;
    private float preco;
    
    public Produtos() {
        this.codigo = 0;
        this.modelo = "";
        this.nome = "";
        this.tamanho = "";
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int  cod){
        this.codigo = cod;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String mod){
        this.modelo = mod;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTamanho(){
        return this.tamanho;
    }
    public void setTamanho (String tam){
        this.tamanho = tam;
    }
    public float getPreco(){
        return this.preco;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public void verProdutos(){
        System.out.println("-----------------------------------");
        System.out.println("T A B E L A _ D E _ P R O T U D O S");
        System.out.println("Código = " + this.getCodigo());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("-----------------------------------");
    }

    @Override
    public void cadastrarCodigo(int c) {
        if (this.getCodigo() == 0) {
            this.setCodigo(c);
        } else {
            System.out.println("O produto já tem um código cadastrado.");
        }
    }

    @Override
    public void descadrastrarCodigo() {
        if (this.getCodigo() != 0) {
            this.setCodigo(0);
        } else {
            System.out.println("Sem Produto cadastrado.");
        }
    }

    @Override
    public void cadastrarModelo(String m) {
        if (this.getModelo().isEmpty()) {
            this.setModelo(m);
        } else {
            System.out.println("Produto já cadastrado.");
        }
    }

    @Override
    public void descadastrarModelo() {
        if (!(this.getModelo().isEmpty())) {
            this.setModelo(null);
        } else {
            System.out.println("Produto não cadastrado");
        }
    }

    @Override
    public void cadastrarNome(String n) {
        if (this.getNome().isEmpty()) {
            this.setNome(n);
        } else {
            System.out.println("Nome já cadastrado.");
        }
    }

    @Override
    public void descadastrarNome() {
        if (!(this.getNome().isEmpty())) {
            this.setNome(null);
        } else {
            System.out.println("Nome não cadastrado.");
        }
    }

    @Override
    public void cadastrarTamanho(String t) {
        if (this.getTamanho().isEmpty()) {
            this.setTamanho(t);
        } else {
            System.out.println("Tamanho não cadastrado.");
        }

    }

    @Override
    public void descadastrarTamanho() {
        if (!(this.getTamanho().isEmpty())) {
            this.setTamanho(null);
        } else {
            System.out.println("Tamanho não cadastrado.");
        }

    }

    @Override
    public void cadastrarPreco(float p) {
        if (this.getPreco() == 0) {
            this.setPreco(p);
        } else {
            System.out.println("Preço já cadastrado.");
        }
    }

    @Override
    public void descadastrarPreco() {
        if (this.getPreco() != 0) {
            this.setPreco(0);
        } else {
            System.out.println("Sem Preço.");
        }
    }
}
