/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13ex;

/**
 *
 * @author Luan
 */
public class Aula13Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c = new Calculadora();
        
        int a = c.calc(10, "/", 7);
        double b = c.calc(5, "/", 2);
        System.out.println(a);
        System.out.printf("%.2f", b);
    }
    
}
