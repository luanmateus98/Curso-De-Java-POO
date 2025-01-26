/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07ex2;

/**
 *
 * @author Luan
 */
public class Lutador implements InterfaceLutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    //Métodos Especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Peso Inválido!";
        } else if (peso <= 70.3) {
            this.categoria = "Peso Leve.";
        } else if (peso <= 83.9) {
            this.categoria = "Peso Médio.";
        } else if (peso <= 120.2) {
            this.categoria = "Peso Pesado.";
        } else {
            this.categoria = "Inválido!";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    
    //Métodos Públicos
    @Override
    public void apresentar() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador  *" + this.getNome() + "*");
        System.out.println("Diretamente de(da) " + this.nacionalidade );
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " de Altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    @Override
    public void status() {
        System.out.println(this.getNome() + " é um " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " Vezes.");
        System.out.println("Perdeu " + this.getDerrotas() + " Vezes.");
        System.out.println("Empatou " + this.getEmpates() + " Vezes.    ");
    }

    @Override
    public void ganhaLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perdeLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
}
