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
class Rectangle {
    private int upper_x;    
    private int upper_y;
    private int lower_x;
    private int lower_y;

    public Rectangle() {
    }

    public Rectangle(int upper_x, int upper_y, int lower_x, int lower_y) {
        this.upper_x = upper_x;
        this.upper_y = upper_y;
        this.lower_x = lower_x;
        this.lower_y = lower_y;
    }
    
    public double CalcPerimeter() {
        double result = (Math.abs(upper_x - lower_x) + Math.abs(upper_y - lower_y)) * 2;
        return result;
    }
    
    public double CalcArea() {
        double result = (Math.abs(upper_x - lower_x) * Math.abs(upper_y - lower_y));
        return result;
    }

}
