/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02ex2;

/**
 *
 * @author Luan
 */
public class Calculos {
    
    String simb;
    int res;
    float resF;
    
    int mais(int a,int b){
        int r  = a + b;
        res = r;
        return res;
        
    }
    int menos(float a, float b){
        int r = (int) (a - b);
        res = r;
        return res;
    }
    int mult (int a, int b){
        int r = a * b;
        res = r;
        return res;
    }
    float div(float a, float b){
        float rF = a / b;
        resF = rF;
        return resF;
    }
}
