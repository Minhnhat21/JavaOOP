/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai11;

import java.util.Random;

/**
 *
 * @author nguye
 */
public class ForLoopEx1 {
    public static void main(String[] args) {
        int n = 100;
        double s = 0;
        
        //Tinh tong thu nhat
        for (int i = 1; i <= n; i++) {
            s = s + (double) 1/i;

        }
        System.out.println("Tong thu nhat: " + s);
        //Tinh tong thu hai
        n = 99;
        int s2 = 0;
        
        for (int i = 1; i <= n ; i += 2) {
            s2 += i;        
        }
        System.out.println("Tong thu hai: " + s2);
        
        for (int i = 0; i < 10; i++) {
            Random  rdn = new Random();
            int x = rdn.nextInt(101);
            System.out.println(x);         
        }
        
    }
 
}
