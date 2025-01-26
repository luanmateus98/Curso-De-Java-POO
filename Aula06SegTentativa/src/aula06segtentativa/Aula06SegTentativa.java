/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06segtentativa;

/**
 *
 * @author Luan
 */
public class Aula06SegTentativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produtos pro1 = new Produtos();
        Produtos pro2 = new Produtos();
        
        pro1.cadastrarCodigo(111);
        pro1.cadastrarModelo("Camisa");
        pro1.cadastrarNome("South to South");
        pro1.cadastrarPreco(149.90f);
        pro1.cadastrarTamanho("M");
        
        pro2.cadastrarCodigo(222);
        pro2.cadastrarModelo("Calça");
        pro2.cadastrarNome("Oakley");
        pro2.cadastrarTamanho("M");
        pro2.cadastrarPreco(350.99f);
        pro2.cadastrarCodigo(121);
        pro2.cadastrarModelo("Zeze");
        pro2.descadastrarPreco();
        pro2.cadastrarPreco(250f);
        pro2.cadastrarPreco(100f);
        
        pro1.verProdutos();
        pro2.verProdutos();
        
    }
    
}
