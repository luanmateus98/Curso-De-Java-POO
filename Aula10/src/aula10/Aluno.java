/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author Luan
 */
public class Aluno extends Pessoa {
    //ATRIBUTOS
    private int matricula;
    private String curso;
    
    //MÉTODOS ESPECIAS
    /*public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }*/

    public int isMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    //MÉTODOS PÚBLICOS 
    public void cancelarMatri(){
        System.out.println("Matricula será cancelada.");
    }
}
