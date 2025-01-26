/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14;

/**
 *
 * @author Luan
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Luan", 26, "M", "Luan1998");
        g[1] = new Gafanhoto("Enmily", 24, "F", "Enmily2000");
        
        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]); // Luan assistiu o vídeo POO
        vis[1] = new Visualizacao(g[0], v[2]); // Luan assistiu o vídeo HTML5
        vis[4] = new Visualizacao(g[0], v[1]); // Luan assistiu o vídeo PHP
        vis[0].avaliar(10);
        
        vis[2] = new Visualizacao(g[1], v[1]); // Enmily assistiu o vídeo POO
        vis[3] = new Visualizacao(g[1], v[2]); // Enmily assistiu o vídeo HTML5
        vis[1].avaliar(100.0f);
        System.out.println(vis[0].toString()); 
        System.out.println(vis[1].toString());
        
    }
    
}
