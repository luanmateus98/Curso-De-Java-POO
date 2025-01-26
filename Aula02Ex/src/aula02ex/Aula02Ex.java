/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02ex;

/**
 *
 * @author Luan
 */
public class Aula02Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celular md1 = new Celular();
        
        md1.marca = "Iphone";
        md1.modelo = "15 Pro Max, 256GB";
        md1.cor = "Natural";
        md1.bateria = 96.5f;
        md1.detalhe = false;
        md1.valor = 7.400f;
        md1.ligando();
        md1.status();
        System.out.println("");
        System.out.println("");
        
        md1.jogando();
        md1.ligando();
    }
    
}
