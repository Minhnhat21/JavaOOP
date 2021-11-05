/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class ArrayExample {
    public static void main(String[] args) {
//        int[] a;
//        //khoi tao
//        a = new int[4];
//        a[1] = 1;
//        a[2] = 2;
//        a[3] = 3;
//        a[0] = 4;
//        
//        //Xuat
//        System.out.println(a.toString());
//        System.out.println(Arrays.toString(a));
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap so luong phan tu mang: ");
//            
//        int n = sc.nextInt();
//        int[] c = new int[n];
//            
//        for (int i = 0; i < c.length; i++) {
//            System.out.println("c[" +i+ "]= ");;
//            String input = sc.nextLine();
//            c[i] = Integer.parseInt(input);     
//        }
//            System.out.println("Cac gia tri cua mang la: ");
//            System.out.println(Arrays.toString(c));
//            
//       for (int i = 0; i < c.length; i++) {
//            System.out.println("c[ +" + i + "] = ");
//        }
        
            Random rdn = new Random();
        int[] d = new int[40];
        for (int i = 0; i < d.length; i++) {
            d[i] = rdn.nextInt(1000);
        }
        
        System.out.println("Phan tu mang d: ");
        System.out.println(Arrays.toString(d));
    }
}
