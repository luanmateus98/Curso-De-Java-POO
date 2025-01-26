/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

/**
 *
 * @author Luan
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Visitante
        Visitante v = new Visitante();
        v.setNome("Jao");
        v.setIdade(25);
        v.setSexo("M");
        System.out.println(v.toString());
        
        //Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setIdade(18);
        a1.setSexo("F");
        a1.setMatricula(123);
        a1.setCurso("T.I");
        System.out.println(a1.toString() + a1.getCurso() + " -- " + a1.getMatricula()); 
        a1.pagarMensalidade();
        
        //Bolsista
        Bolsista b1 = new Bolsista();
        b1.setNome("Luan");
        b1.setBolsa(12.5f);
        b1.setCurso("Programação");
        b1.setMatricula(1212);
        b1.setIdade(26);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        //Técnico
        Tecnico t1 = new Tecnico();
        t1.setNome("Paulo");
        t1.setIdade(19);
        t1.setSexo("M");
        t1.setCurso("Médico");
        t1.setMatricula(1242);
        t1.setRegistroProfissional(2121);
        t1.pagarMensalidade();
        
        //Professor
        Professor p1 = new Professor();
        p1.setNome("José");
        p1.setIdade(58);
        p1.setEspecialidade("T.I");
        p1.setSalario(12.250f);
        p1.setSexo("M");
        
        Notas notas = new Notas();
        notas.mediaTirada(p1, t1);
    }
    
}
