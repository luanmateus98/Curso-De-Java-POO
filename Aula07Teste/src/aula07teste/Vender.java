/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07teste;

/**
 *
 * @author Luan
 */
public class Vender {
    //Atributos
    private Produto prod;
    private Cliente cliente;
    private boolean vender;
    
    //Métodos Especiais

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public boolean isVender() {
        return vender;
    }

    public void setVender(boolean vender) {
        this.vender = vender;
    }
    
    //Métodos Públicos
    public void venderProd(Produto p1, Cliente c1){
        if (p1.isDisponivel() 
                && c1.getLimiteCartão() >= p1.getValor()){
            c1.setLimiteCartão( c1.getLimiteCartão() - p1.getValor());
            //this.cliente.setLimiteCartão(this.cliente.getLimiteCartão() - this.prod.getValor()); 
            System.out.println("Produtos vendido!");
            c1.statusCliente();
        } else{
            System.out.println("Saldo insulficiente");
        }
    }
}
