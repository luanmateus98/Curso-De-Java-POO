/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Notas {
    private Aluno aluno;
    private Professor professor;
    private float nota1, nota2, media;
    
    public void mediaTirada(Professor p, Aluno a){
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual a primeira nota do " + a.getNome() + " ?");
        nota1 = tec.nextFloat();
        System.out.println("Qual a primeira nota do " + a.getNome() + " ?");
        nota2 = tec.nextFloat();
        media = (nota1 + nota2)/2;
        
        System.out.println("O professor " + p.getNome() + " deu a média de " + 
                media + " para o aluno " + a.getNome());
    }
}
