/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai16;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 //           int[] a;
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

//        System.out.print("Nhap so luong phan tu mang: ");
//            
//        int n = sc.nextInt();
//        int[] c = new int[n];
//            
//        for (int i = 0; i < c.length; i++) {
//            System.out.println("c[" +i+ "]= ");;
//            int input = sc.nextInt(); 
//            c[i] = input;
//        }
//            System.out.println("Cac gia tri cua mang la: ");
//            System.out.println(Arrays.toString(c));
//            
//       for (int i = 0; i < c.length; i++) {
//            System.out.println("c[ +" + i + "] = ");
//        }
        
        Random rdn = new Random();
        int[] d = new int[20];
        for (int i = 0; i < d.length; i++) {
            d[i] = rdn.nextInt(1000);
        }
        
        System.out.println("Phan tu mang d: ");
        System.out.println(Arrays.toString(d));
        
        //Sap xep mang
        Arrays.sort(d);
        System.out.println("Mang sau khi sap xep tang dan: ");
        System.out.println(Arrays.toString(d));
        
        
        System.out.print("Nhap gia tri x can tim: ");
        String input = sc.nextLine();
        int x = Integer.parseInt(input);
        
        int index = Arrays.binarySearch(d, x);
        
        if (index < 0) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Tim thay vi tri thu " + (index + 1));
        }
        
//        boolean flag = false;
//        for (int i = 0; i < d.length; i++) {
//            if(d[i] == x) {
//                System.out.println("So can tim kiem nam o vi tri " + i);
//                flag = true;
//                break;
//            }   
//        }
//        
//        if(!flag) {
//            System.out.println("Giá tri can tim khong co trong mang");
//        }
    }
}
