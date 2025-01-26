/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08ex;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class VenderCarro implements InterVender{
    //ATRIBUTOS
    private Carro carro;
    private Cliente cliente;
    private int dia, mes, ano;
    
    //MÉTODOS ESPECIAIS

    public VenderCarro(Carro carro, Cliente cliente) {
        this.carro = carro;
        this.cliente = cliente;
        Calendar cal = Calendar.getInstance();
        this.dia = cal.get(Calendar.DATE);
        this.mes = cal.get(Calendar.MONTH);
        this.ano = cal.get(Calendar.YEAR);
        
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

   
    @Override
    public void vender(Cliente cliente, Carro car) {
        if (cliente.getDinheiro() > car.getValor()) {
            Scanner tec = new Scanner(System.in);
            System.out.println("Cliente tem dinheiro para comprar o carro! Efetuar a compra ? [1] Para Sim / [2] Para não. ");
            int eai = tec.nextInt();
            if (eai == 1) {
                cliente.setDinheiro(carro.getValor() - cliente.getDinheiro());
                System.out.println("Carro comprado com sucesso!");
                System.out.println("dia da compra " + "(" + this.getDia() + "/" + this.getMes() + "/" + this.getAno() + ")");
            } else {
                System.out.println("Compra cancelada.");
            }
        } else {
            System.out.println("Cliente não tem dinheiro suficiente.");
        }
    }

    @Override
    public void valorCarro(float v) {
        carro.alterarValor(v);
    }
    
}
