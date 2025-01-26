/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05segtentativa;

/**
 *
 * @author Luan
 */
public class ContaBanco {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void verDados (){
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("Numero da Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome do dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    //METODOS
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
            System.out.println("Conta Corrente aberta com sucesso");
        } else if(t == "CP") {
            this.setSaldo(150);
            System.out.println("Conta Poupança aberta com sucesso.");
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0 && this.status == true) {
            System.out.println("Precisa efetuar o saque do valor " + this.getSaldo()+
                    " para poder fechar a conta.");
        } else if (this.getSaldo() < 0 && this.status == true){
            System.out.println("Precisa quitar os débitos.");
        } else if (this.status == false)  {
            System.out.println("Essa conta não existe");
        } else {
            this.setDono(null);
            this.setNumConta(0);
            this.setTipo(null);
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }
    public void depositar(double  v){
        this.setSaldo(this.getSaldo() + v);
        System.out.println("Valor depositado!");       
    }
    public void sacar(double v){
        if (this.getStatus() == true){
            if (v <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque efetuado!");
            } else if (v > this.getSaldo()){
                System.out.println("Sem limite disponivel para saque!");
            }
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getSaldo() > v) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Valor descontado com sucesso!");
        } else if (this.getSaldo() < v) {
            System.out.println("Saldo insuficiente! Valor entrarar em débito.");
            this.setSaldo(this.getSaldo() - v);
        }
    }
    //CONSTRUTOR
    public ContaBanco(){
        this.saldo = 0;
        // this.setSaldo(0); PODE SER FEITO DESSE JEITO TAMBÉM, MAS O JAVA ESTA IMPLICANDO, VAMOS DEIXAR DA PRIMEIRA FORMA MESMO.
        this.status = false;
        // this.setStatus(false);
    }
    //METODOS ACESSORES
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setTipo (String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    
}
