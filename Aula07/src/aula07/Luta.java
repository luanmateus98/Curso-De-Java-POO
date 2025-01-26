/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

import java.util.Random;

/**
 *
 * @author Luan
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    //Métodos Públicos
    public void marcaLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) 
                && l1 != l2) {
            String luta;
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            if (this.isAprovada()) {
                luta = "Aprovada!";
                System.out.println("A luta foi " + luta);
            }
        } else {
            System.out.println("Impossivel marcar a luta!"); 
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if (this.isAprovada()) {
            System.out.println("##DESAFIADO##");
            this.getDesafiado().apresentar();
            System.out.println("##DESAFIANTE##");
            this.getDesafiante().apresentar();
            
            //int vencedor = (int) (0 + Math.random() * (4 - 0));
            Random ale = new Random();
            int vencedor =  ale.nextInt(3); // 0 1 2
            
            System.out.println("=============  RESULTADO DA LUTA =================");
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("Empatou!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado + " Venceu a Luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante + " Venceu a Luta!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
              System.out.println("Luta não pode acontecer");
        } 
    }
 
}
