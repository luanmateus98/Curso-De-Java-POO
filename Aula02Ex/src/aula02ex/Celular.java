/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02ex;

/**
 *
 * @author Luan
 */
public class Celular {
    String marca;
    String modelo;
    String cor;
    float bateria;
    boolean detalhe;
    float valor;
    boolean statusLigDes; 
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.printf("A bateria esta %.1f \n", this.bateria); 
        if (this.detalhe == false){
            System.out.println("Nao tem nenhum detalhe no " + this.modelo);
        } else{
            System.out.println("A alguns detalhes no " + this.modelo);
        }       
        System.out.printf("O valor do celular e: %.3fR$ ", this.valor);
        
    }
    void ligado(){
        statusLigDes = true;
    } 
    void desligado(){
        statusLigDes = false;
    }
    void jogando(){
        if (statusLigDes == true){
            System.out.println("O celular está ligado e jogando. ");
        } else{
            System.out.println("Celular está desligado e por isso não tem como jogar.");
        }
    }
    void ligando(){
        if (statusLigDes == true || statusLigDes == false){
            if (statusLigDes == true){
                System.out.println("O celular está em uma chama com a tela ligada.");
            } else{
                System.out.println("O celular está em chamada com a tela desligada.");
            }
        }
    }
}
