/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08ex;

/**
 *
 * @author Luan
 */
public class Aula08Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1 = new Cliente("Luan", 450683000, "Rua da norte", 1050.000f);
        
        Carro car1 = new Carro("BMW", "320i", "AZUL", 358.600f, "ZERO DETALHE", 2024, 0f);
        
        VenderCarro v = new VenderCarro(car1, c1);
        v.vender(c1, car1);
    }
    
}
