/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Luan
 */
public class Peixe extends Animal {
    // Atributo
    private String corEscama;
    
    // Métodos públicos
    public void soltarBolas(){
        System.out.println("Soltar uma bolha.");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz barulho.");
    }
    
    // Métodos especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
