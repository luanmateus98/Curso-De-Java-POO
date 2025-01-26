/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05segtentativa;

/**
 *
 * @author Luan
 */
public class Aula05SegTentativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* ContaBanco p1 = new ContaBanco();
        
        p1.setDono("Carlota");
        p1.setNumConta(111);
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.verDados();*/
        
        
        
        ContaBanco p2 = new ContaBanco();
        p2.verDados();
        p2.setDono("ZeZe");
        p2.setNumConta(123);
        p2.abrirConta("CP");
        p2.depositar(550);
        //p2.sacar(700);
        p2.pagarMensal();
        p2.depositar(20);
       // p2.fecharConta();
        //p2.verDados();
        p2.verDados();
    }
    
    
}
