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
class Circle {
    private double radius;
    private int x, y;

    public Circle() {
        
    }

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    
    public double CalcPerimeter() {
        double result = 2 * Math.PI * this.radius;
        return result;
    }
    
    public double CalcArea() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }
    
    
    
    
    
}
