/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Luan
 */
public class Cachorro extends Mamifero {
    // Métodos públicos
    public void enterrarOsso(){
        System.out.println("Enterrar osso.");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo.");
    }
    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }
   
}
