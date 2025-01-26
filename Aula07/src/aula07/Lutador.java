/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author Luan
 */

//ATRIBUTOS
public final class Lutador implements InterfaceLutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //MÉTODOS ESPECIAIS
    public Lutador(String no, String na, int id, float al,
            float pe, int vi,int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;        
    }
    

    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float al){
        this.altura = al;
    }
    public float getPeso(){
        return peso;        
    }
    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria(); // =Colando aqui o setPeso, sempre que configurar o peso, será configurado o atributo catégoria.
    }
    public String getCategoria(){
        return categoria;
    }
    private void setCategoria(/*Tive que tirar o paramêtro daqui porque não vai receber nada de fora, apenas da classe mesmo (setPeso)*/){
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3 ){
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2){
            this.categoria = "Pesado"; 
        } else {
            this.categoria = "Inválida";
        } 
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int em){
        this.empates = em;
    }
    
    //MÉTODOS ESPECIAIS
    @Override
    public void apresentar() {
        System.out.println("---------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos a vocês o Lutador: ** " + this.getNome() + " **");
        System.out.println("Diretamente da(de) " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + "kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    @Override
    public void status() {
        System.out.print(this.getNome());
        System.out.println(" é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " errotas");
        System.out.println(this.getEmpates() + " empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
            this.setEmpates(this.getEmpates() + 1);
        }
}
