/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

/**
 *
 * @author Luan
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("TocToc", 1.5f); // TEM COMO USAR ASSIM E SEM OS PARAMENTOS
        //Caneta c1 = new Caneta(); ASSIM!
        //c1.setModelo("BIC cristal");
        //c1.setPonta(0.5f);
        c1.tampada();
        c1.status();
       
    }
    
}
