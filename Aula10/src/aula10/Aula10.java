/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;

/**
 *
 * @author Luan
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pessoa1 = new Pessoa(); //("Edelmir", 56, "M");
        Aluno aluno1 = new Aluno(); //("Luan", 26, "M", 0321, "T.I");
        Professor professor1 = new Professor(); //("Enmily", 24, "F", "Fundamental", 1.800f);
        //Funcionario funcionario1 = new Funcionario("Cristiana", 49, "F", "Operária", true);
        Funcionario func = new Funcionario(); //("Zé", 52, "M");
        //func.setNome("Cal");
        //System.out.println(func.getNome());
        System.out.println(func.toString());
        
    }
    
}
