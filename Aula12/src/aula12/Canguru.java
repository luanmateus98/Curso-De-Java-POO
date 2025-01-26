/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Luan
 */
public class Canguru extends Mamifero {
    // Métodos públicos
    public void usarBolsa(){
        System.out.println("Usando a bolsa.");
    }
    
     @Override
    public void locomover(){
         System.out.println("Saltando...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Ohooh Ohooh");
    }
}
