/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02ex2;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Aula02Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculos calc = new Calculos();
        Scanner tec = new Scanner(System.in);
        int r;
        String cont = "";
        
        do {            
            System.out.println("Qual a conta ? ");
            System.out.print("Primeiro valor ");
            int v1 = tec.nextInt();
            System.out.print("simbolo ");
            String s = tec.next().toString();   
            System.out.print("Segundo valor ");
            int v2 = tec.nextInt();

            if(s.equals("+")){
              calc.mais(v1, v2); 
              r = calc.res;
              System.out.println("O resultado foi: " + r);
            } else if (s.equals("-")){
                calc.menos(v1, v2);
                r = calc.res;
                System.out.println("O resultado foi: " + r);
            } else if (s.equals("*")){
                calc.mult(v1, v2);
                r = calc.res;
                System.out.println("O resultado foi: " + r);
            }else {
                calc.div(v1, v2);
               float rr = calc.resF;
                System.out.println("O resultado foi: " + rr);
            }
            
                System.out.println("");
                System.out.print("Quer contiuar ?");
                cont = tec.next().toString();
        } while(cont.equals("S"));
        
    }
    
}
