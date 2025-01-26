/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13ex;

/**
 *
 * @author Luan
 */
public class Calculadora {
    public int calc(int v1,String t, int v2){
        int r = 0;
        if (t.equals("+")) {
            int r1 = v1 + v2;
            r =r1;
        } else if (t.equals("-")) {
             int r2 = v1 - v2;
             r = r2;
        } else if (t.equals("*")){
            int r3 = v1 * v2;
            r = r3;
        } else if (t.equals("/")){
            int r4 = v1 /v2;
            r = r4;
        }
        return r;
    }
    public float calc(float v1,String t, float v2){
        float  r = 0;
        if (t.equals("+")) {
            float r1 = v1 + v2;
            r =r1;
        } else if (t.equals("-")) {
             float r2 = v1 - v2;
             r = r2;
        } else if (t.equals("*")){
            float r3 = v1 * v2;
            r = r3;
        } else if (t.equals("/")){
            float r4 = v1 /v2;
            r = r4;
        }
        return r;
    }
}
