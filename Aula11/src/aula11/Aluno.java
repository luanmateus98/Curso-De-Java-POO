/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Luan
 */
public class Aluno extends Pessoa {
    //ATRIBUTO
    private int matricula;
    private String curso;
    
    //MÉTODOS PÚBLICOS
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do " + this.getNome());
        System.out.println("");
    }
    
    //MÉTODOS ESPECIAIS
    public int getMatricula() {
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
    
}
