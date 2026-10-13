/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOPRAKP2;

public class Segitiga {
    double a;
    double b;
    double c;
    double keliling;
    double Luas;
    
    void hitungS(){
    Luas = 0.5 * a * b;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Luas = " + Luas);
    }
    void findC(){                
        c = Math.sqrt((a * a) + (b * b));
        keliling = a + b + c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Keliling = " + keliling);
    }
}
