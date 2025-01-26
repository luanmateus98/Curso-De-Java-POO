/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aula06segtentativa;

/**
 *
 * @author Luan
 */
public interface InterfProduto {
    public abstract void cadastrarCodigo( int c);
    public abstract void descadrastrarCodigo();
    public abstract void cadastrarModelo( String m);
    public abstract void descadastrarModelo();
    public abstract void cadastrarNome(String n);
    public abstract void descadastrarNome();
    public abstract void cadastrarTamanho(String t);
    public abstract void descadastrarTamanho();
    public abstract void cadastrarPreco(float p);
    public abstract void descadastrarPreco();
    
}
