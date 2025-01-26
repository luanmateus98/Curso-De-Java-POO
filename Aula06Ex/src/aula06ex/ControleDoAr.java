/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06ex;

/**
 *
 * @author Luan
 */
public class ControleDoAr implements Controladora {
    // Atributos
    private boolean ligado;
    private int velocidade;
    private float temp;
    
    //Métodos Especiais
    public ControleDoAr(){
        this.ligado = false;
        this.velocidade = 3;
        this.temp = 20;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private int getVelocidade(){
        return this.velocidade;
    }
    private void setVelocidade(int v){
        this.velocidade = v;
    }
    private float getTemp(){
        return temp;
    }
    private void setTemp(float t){
        this.temp = t;
    }
    public void verAr(){
        System.out.println("Ligado = " + this.getLigado());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Temperatura: " + this.getTemp() + "C");
    }

    @Override
    public void ligar() {
        if (!(this.getLigado())) {
            this.setLigado(true);
        } else {
            System.out.println("O Ar já está ligado!");
        }
    }

    @Override
    public void desligar() {
        if (this.getLigado()) {
            this.setLigado(false);
            this.setTemp(0);
            this.setVelocidade(0);
        } 
    }

    @Override
    public void aumentarAr() {
        if (this.getLigado() && this.getTemp() < 28.1) {
            this.setTemp(this.getTemp() + 0.5f);
            System.out.println("Aumetada a temperatura para " + this.getTemp());
        } else if (this.getLigado() && this.getTemp() >= 28) {
            System.out.println("Temperatura maxima atingida!!");
        }
    }

    @Override
    public void diminuirAr() {
        if (this.getLigado() && this.getTemp() >= 17) {
            this.setTemp(this.getTemp() - 0.5f);
        } else if (this.getLigado() && this.getTemp() < 17){
            System.out.println("Temperatura minima atingida");
        }
    }

    @Override
    public void tempArmena() {
        this.setTemp(22);
    }

    @Override
    public void tempFria() {
        this.setTemp(18.5f);
    }

    @Override
    public void velMais() {
        if (this.getVelocidade() >= 1 && this.getVelocidade() < 6 && this.getLigado()) {
            this.setVelocidade(this.getVelocidade() + 1);
        } else {
            System.out.println("Velocidade maxima atingida.");
        }
    }

    @Override
    public void velhoMenos() {
        if (this.getLigado() && this.getVelocidade() > 1 && this.getVelocidade() <= 6) {
            this.setVelocidade(this.getVelocidade() - 1);
        } else {
            System.out.println("Velocidade minima atingida.");
        }
    }
    
}
