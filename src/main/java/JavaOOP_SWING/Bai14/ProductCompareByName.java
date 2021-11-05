/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai14;

import java.util.Comparator;

/**
 *
 * @author nguye
 */
public class ProductCompareByName implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
