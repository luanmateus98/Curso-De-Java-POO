/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08ex;

/**
 *
 * @author Luan
 */
public class Carro {
    //ATRIBUTOS
    private String marca, modelo, cor, detalhes;
    private int ano;
    private float km, valor;
    private boolean vendido;
    
    //MÉTODOS ESPECIAIS

    public Carro(String marca, String modelo, String cor, float valor, String detalhes, int ano, float km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor;
        this.detalhes = detalhes;
        this.ano = ano;
        this.km = km;
        this.vendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public float getValor(){
        return this.valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    
    //MÉTODOS PÚBLICOS
    public void excluirCarro(){
        this.setMarca(null);
        this.setModelo(null);
        this.setAno(0);
        this.setCor(null);
        this.setDetalhes(null);
        this.setValor(0);
        this.setVendido(false);
        System.out.println("Veículo Excluido!!!");
    }
    public void alterarValor(float v){
        this.setValor(v);
    }
    
}
