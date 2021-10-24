/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai04;

/**
 *
 * @author nguye
 */
public class Geogaphic {
    public static void main(String[] args) {
        Circle circle = new Circle(2,1,2);
        
        System.out.println("Chu vi hinh tron: " + circle.CalcPerimeter());
        System.out.println("Dien hinh tron: " + circle.CalcArea());
        
        Rectangle retangle = new Rectangle(1,2,4,3);
        
        System.out.println("Chu vi hinh chu nhat: " + retangle.CalcPerimeter());
        System.out.println("Dien tich hinh chu nhat: " + retangle.CalcArea());

    }
}
