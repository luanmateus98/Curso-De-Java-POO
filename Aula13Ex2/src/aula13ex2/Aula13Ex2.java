/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13ex2;

/**
 *
 * @author Luan
 */
public class Aula13Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        // Mamifero
        m.emitirSom();
        System.out.println(m.toString());
        
        // Lobo
        l.setPeso(10.2f);
        l.setIdade(5);
        l.setMembros(4);
        l.setCorPelo("Cinza e Branco");
        l.emitirSom();
        System.out.println(l.toString());
        
        
        // Cachorro
        c.setPeso(5.6f);
        c.setMembros(4);
        c.setIdade(7);
        c.setCorPelo("Marrom");
        c.emitirSom();
        System.out.println(c.toString());
        
        System.out.println("");
        System.out.println("");
        
        c.reagir("Oi cachorrinho");
        c.reagir(12.5f, 5);
        c.reagir(4, 30);
    }
    
}
