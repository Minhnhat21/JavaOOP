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
public class FibonacciNumber {

    public FibonacciNumber() {
    }
    
    public int calcFib(int n) {
        //dieu kien dung
        if(n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        //loi goi de quy
        return (calcFib(n-1) + calcFib(n-2));
    }
}
