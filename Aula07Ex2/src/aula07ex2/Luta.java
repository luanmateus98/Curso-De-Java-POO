/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07ex2;

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
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta marcada com sucesso! " );
            System.out.println("Entre o " + this.getDesafiado().getNome() + " & " + this.getDesafiante().getNome());
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if (this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            
            Random ale = new Random();
            int vencedor = ale.nextInt(3);
            
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O lutador " + this.getDesafiado().getNome() + " Venceu a Luta.");
                    this.getDesafiado().ganhaLuta();
                    this.getDesafiante().perdeLuta();
                    break;
                case 2:
                    System.out.println("O lutador " + this.getDesafiante().getNome() + " Venceu a Luta.");
                    this.desafiante.ganhaLuta();
                    this.desafiado.perdeLuta();
                    break;    
                default:
                    throw new AssertionError();
            }
        } else {
            System.out.println("A Luta não pode acontecer!");
        }
    }
    
}
