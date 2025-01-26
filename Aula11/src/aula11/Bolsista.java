/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Luan
 */
public class Bolsista extends Aluno {
    //ATRIBUTOS
    private float bolsa;
   
    //MÉTODOS PÚBLICOS
    public void renovarBolsa(){
        
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
        System.out.println("");
    }
    
    //MÉTODOS ESPECIAIS

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
