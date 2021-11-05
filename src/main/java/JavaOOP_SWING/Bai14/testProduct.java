/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai14;

import java.util.Arrays;

/**
 *
 * @author nguye
 */
public class testProduct {
    public static void main(String[] args) {
        
        Product[] product = new Product[] {new Product("Vinamik", 27000),
                                           new Product("Milo", 32000),
                                            new Product("Fami", 24000),
                                           new Product("Hà Lan", 26000)};
        
        System.out.println("Mang cac san pham ban dau: ");
        System.out.println(Arrays.toString(product));
        
        Arrays.sort(product, new ProductCompareByPrice());
        System.out.println("Mang cac san pham sau khi sap xep theo gia: ");
        System.out.println(Arrays.toString(product));
        
        Arrays.sort(product, new ProductCompareByName());
        System.out.println("Mang cac san pham sau khi sap xep theo ten: ");
        System.out.println(Arrays.toString(product));
    }
}
