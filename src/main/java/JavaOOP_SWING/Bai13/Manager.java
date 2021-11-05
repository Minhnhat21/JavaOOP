/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai13;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class Manager extends Person{
    private Coffeshop[] coffeshop;
    private double income;

    public Manager() {
        super();
    }

  

    public Manager(Coffeshop[] coffeshop, double income, String name, int gender, Date birthDay) {
        super(name, gender, birthDay);
        this.coffeshop = coffeshop;
        this.income = income;
    }

    

    public Coffeshop[] getCoffeshop() {
        return coffeshop;
    }

    public void setCoffeshop(Coffeshop[] coffeshop) {
        this.coffeshop = coffeshop;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        String ketqua = super.toString();
        
        ketqua += "\nManager{" + "coffeshop=" + Arrays.deepToString(coffeshop) + ", income=" + income + '}';
        return ketqua;
    }

    
    
    
}
