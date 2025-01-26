/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07teste;

/**
 *
 * @author Luan
 */
public class Aula07Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto[] produto = new Produto[4];
        produto[0] = new Produto(111, "CELULAR", "Iphone 15 Pro Max", 7.200f, true);
        produto[1] = new Produto(222, "GELADEIRA", "Brastemp Ultra Leg", 9.000f, true);
        produto[2] = new Produto(333, "FOGÃO", "EletroLux", 4.199f, true);
        produto[3] = new Produto(444, "GAME", "PlayStation 5", 5.500f, true);
        produto[0].apresentarProtudo();
        
        System.out.println("=======================");
        Cliente cliente = new Cliente("Zézé", "Rua do lado esquerdo", 450, 5.000f);
        cliente.statusCliente();
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");
        
        Vender vender = new Vender();
        vender.venderProd(produto[2], cliente);
    }
    
}
