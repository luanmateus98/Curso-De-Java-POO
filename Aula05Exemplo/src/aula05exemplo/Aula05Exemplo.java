/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05exemplo;

/**
 *
 * @author Luan
 */
public class Aula05Exemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pagamento p1 = new Pagamento();        
        p1.cadastrarCartao(1234);
        p1.setNome("Ze bilola");
        p1.setAno(2030);
        p1.setCvc(369);
        p1.setLimete(5000);
        p1.verCartao();
        p1.limiteUtilizado(2300);
        p1.verLimite();
        
        Pagamento p2 = new Pagamento();
        //p2.cadastrarCartao(8890);
        p2.setNome("Carminha");
        p2.setAno(20266);
        p2.setCvc(719);
        p2.setLimete(15000);
        p2.verCartao();
        p2.limiteUtilizado(1300);
        p2.verLimite();
    }        
}
