/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int SumInteger = a + b;
        double d = sc.nextDouble();
        float f = sc.nextFloat();
        double SumFloat = d + f;
        
        System.out.print("Tổng 2 số nguyên: " + SumInteger);
        System.out.println("Tổng 2 số thực: " + SumFloat);
    }
}
