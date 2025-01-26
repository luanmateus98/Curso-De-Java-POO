/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05exemplo;

/**
 *
 * @author Luan
 */
public class Pagamento {
    private int numCart;
    private String nome;
    private float limite;
    private int ano;
    private int cvc;
    private boolean status;
    
    public void verCartao(){
        System.out.println("Numero do cartao: " + this.getNumCart());
        System.out.println("Nome: " + this.getNome());
        System.out.println("ano: " + this.getAno());
        System.out.println("CVC: " + this.getCvc());
        System.out.println("status: " + this.getStatus());
    }
    
    public void cadastrarCartao(int c){
        if (this.getStatus() == false) {
            this.setStatus(true);
            this.setNumCart(c);
        } else {
            System.out.println("Cartão já cadastrado!");
        }
    }
    public void apagarCartao(){
        if (this.getStatus() == true) {
            this.setStatus(false);
            this.setNumCart(0000);
            this.setAno(0);
            this.setCvc(0);
            this.setNome(null);        
        } else {
            System.out.println("Erro!! Cartão não encontrado!");
        }
    }
    public void verLimite(){
        System.out.println("Limite disponivel: " + this.getLimite());
    }
    public void limiteUtilizado(float u){
        this.setLimete(this.getLimite() - u);
    }
    
    //Construtor
    public Pagamento(){
        this.setNumCart(0000);
        this.setLimete(0);
        this.setStatus(false);
    }
    public int getNumCart(){
        return this.numCart;
    }
    public void setNumCart(int n){
        this.numCart = n;
    }        
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public float getLimite(){
        return this.limite;
    }
    public void setLimete(float l){
        this.limite = l;
    }
    public int getAno(){
        return this.ano;
    }
    public void setAno(int a){
        this.ano = a;
    }
    public int getCvc(){
        return this.cvc;
    }
    public void setCvc (int c){
        this.cvc = c;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
}
