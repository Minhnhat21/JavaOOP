/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai19;

/**
 *
 * @author nguye
 */
public class TestFib {
    public static void main(String[] args) {
        FibonacciNumber fb = new FibonacciNumber();
        
        int n = fb.calcFib(10);
        System.out.println(n);
    }
   
}
