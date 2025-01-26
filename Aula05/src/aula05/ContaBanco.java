/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    private int opc;
    Scanner tec = new Scanner(System.in);
    
    public ContaBanco(){
        saldo = 0;
        status = false;
    }
   /* public int bemVindo(){
        System.out.println("Ola, seja bem-vindo! ");    
        System.out.println("");
        System.out.println("[1] Abrir uma conta. ");
        System.out.println("[2] Fechar uma conta.");
        System.out.println("[3] Depositar.");
        System.out.println("[4] Sacar.");       
        System.out.print("Qual opcao voce deseja ? ");
        opc = tec.nextInt();
        
        return opc;
    }*/
    public void abrirConta(String t){
        this.setTipo(t);
        setStatus(true);
        if (t.equals("CC")) {
            setSaldo(50);
        } else if (t.equals("CP")) {
            setSaldo(150);
        }    
    }
    public void fecharConta(){
        if (this.saldo > 0){
            System.out.println("Precisa sacar o dinheiro para fechar a conta.");
        } else if (saldo < 0){
            System.out.println("Seu saldo está negativo. Quite a sua divida para fechar a conta.");
        } else if( this.saldo == 0){
            setTipo(null);
            setStatus(false);
            setDono(null);
            setNumConta(0);
        }
    }
    public void depositar(double d){
        if (this.getStatus() == true){
           this.setSaldo(this.getSaldo() + d);
        } else {
            System.out.println("Impossivel depositar.");
        }
    }
    public void sacar(double s){
        if(this.getStatus() == true && this.getSaldo() > 0){
            if (s <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque efetuado!!");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else{
            System.out.println("Ocorreu um erro!");
        }
    }
    public void pagarMensal(){
        if (this.getStatus() == true){
            if (this.getTipo() == "CC" && this.getSaldo() > 12){              
                this.setSaldo(this.getSaldo() - 12);
            } else if (this.getStatus() == true && this.getSaldo() > 20){
                this.setSaldo(this.getSaldo() - 20);
            }
        } else {
            System.out.println("Conta inativa!");
        }
    }
    
    
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        //int nn = (int) (101 + Math.random() * (300 - 101));
        this.numConta = n;
    }
    public String getTipo(){        
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){        
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public double getSaldo(){       
        return this.saldo;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }
    public boolean getStatus(){
        
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    
}
