/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04ex;

/**
 *
 * @author Luan
 */
public class Jogo {
    private String nome;
    private String tipo;
    private float tamanho;
    private String conteudo;
    private boolean jogar;
    private String posso, n;
    private int idade;
    
    
    public Jogo(String n, String t, float tam, String conte){
        this.setNome(n);
        this.setTipo(t);
        this.setTamanho(tam);
        this.setConteuco(conte);
        
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public float getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(float tam){
        this.tamanho = tam;
    }
    public String getConteudo(){
        return this.conteudo;
    }
    public void setConteuco(String conte){
        this.conteudo = conte;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    
    public boolean getJogar(){
        
        if((this.conteudo == "Maior de Idade" && idade >= 18) || (this.conteudo == "Para Todos" && idade >= 1)){
            this.jogar = true;              
        } else {
            this.jogar = false;            
        }
        return this.jogar;
    }
    public String getPosso (){
        if (this.getJogar() == true){
            this.posso = "Sim";
        } else {
            this.posso = "Não";
        }
        return this.posso;
    }
    
    public void status(){
        System.out.println("Nome do Jogo: " + this.getNome());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Tamanho: " + this.getTamanho() + "GB");
        System.out.println("Conteúdo: " + this.getConteudo());
        
        System.out.println("Posso jogar ? " + this.getPosso());       
    }
}
