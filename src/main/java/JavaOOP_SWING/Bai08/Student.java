/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai08;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class Student extends Person implements TaxInterface{
    private String School;

    public Student() {
    }
    
    public Student(String School, String name, int gender, Date birthDay) {
        super(name, gender, birthDay);
        this.School = School;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    @Override
    public double CalcTax(double income) {
        double tax = income * 0.04;
        return tax;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
