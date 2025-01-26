/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13ex2;

/**
 *
 * @author Luan
 */
public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("Auuu! Auu! Au! ");
    }

    @Override
    public String toString() {
        return "Cachorro {" + super.toString() + '}';
    }
    
    public void reagir(String r){
        if (r.equals("Oi cachorrinho")) {
            System.out.println("Latir e Abanar");
        } else {
            System.out.println("Latir");
        }
    }
    
    public void reagir(int h, int m){
        if (h < 12) {
            System.out.println("Abanar o rabo");
        } else if (h <=18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(float p, int i){
        if (p < 6) {
            if (i < 5) {
                System.out.println("Brincar");
            } else {
                System.out.println("Ficar Bravo");
            }
        } else {
            System.out.println("Ignorar e ir deitar");
        }
    }
}
