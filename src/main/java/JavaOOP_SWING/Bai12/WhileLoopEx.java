/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai12;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class WhileLoopEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        int n = 0;
//        int i;
//        //ky thuat cong don
//        double s = 0;
//        n = 100;
//        i = 1;
//        
//        while (i <= 100) {
//            s = s + (double) 1/i; 
//            i++
//        }
//        
//        System.out.println("Tong thu nhat la: " + s);
        
        boolean flag = false;
        
        while(!flag) {
            System.out.println("Nhap so nguyen duong le n = ");
            int x = sc.nextInt();
            
            if((x > 0) && (x% 2 != 0)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        
        // Ky thuat buoc nhay
//        int n = 99;
//        int s2 = 0;
//        int i = 1;
//        while (i < n) {
//            s2 += i;  
//            i++;
//        }
//        System.out.println("Tong thu 2: " + s2);
    }
         
}
