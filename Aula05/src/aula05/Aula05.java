/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Aula05 {
        
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        ContaBanco c1 = new ContaBanco();        
        System.out.println("Ola, seja bem-vindo! ");    
        System.out.println("");
        System.out.println("[1] Abrir uma conta. ");
        System.out.println("[2] Fechar uma conta.");
        System.out.println("[3] Depositar.");
        System.out.println("[4] Sacar.");       
        System.out.print("Qual opcao voce deseja ? ");
        int v1 = tec.nextInt();
        
        switch(v1){
            case 1:
                
        }
    }
    
}
