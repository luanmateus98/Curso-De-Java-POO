/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author Luan
 */
public class Caneta {
    
    public String modelo;
    private float ponta;
    private boolean tampada; 
    
    public Caneta(String m, float p){
        setModelo(m);
        setPonta(p);
        tampar();
    }
    
    /*public Caneta(){
        modelo = "ZipZap";  TEM COMO FAZER O CONSTRUTOR ASSIM TAMBÉM
        ponta = 1.0f;
    }*/
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;    
    }
    public float getPonta(){
        return this.ponta;        
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        tampada = true;
    }
    public void tampada(){
        tampada = false;
    }
    public void status(){
        System.out.println("O modelo da caneta e " + this.getModelo());
        System.out.println("A ponta e " + this.ponta);
        System.out.println("A caneta está tampada ? " + this.tampada);
    }
}
