/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04ex;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Aula04Ex {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        Jogo j1 = new Jogo("GTA 5", "Acao", 2.5f, "Maior de Idade");
        Scanner tec = new Scanner(System.in);
        System.out.print("Olá, precisamos saber sua idade ? ");
        idade = tec.nextInt();
        j1.setIdade(idade);        
        j1.status();
        
        Jogo j2 = new Jogo("Fifa", "Futebol", 1.7f, "Para Todos");
        System.out.print("Olá, precisamos saber sua idade ? ");
        idade  = tec.nextInt();
        j2.setIdade(idade);
        
        j2.status();
        
    }
    
}
