/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai10;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class Student extends Person implements TaxInterface{
    private String School;
    private String hocluc;
    private double hocbong;

    public Student() {
    }
    
    public Student(String School, String name, int gender, Date birthDay) {
        super(name, gender, birthDay);
        this.School = School;
    }

    public Student(String School, String name, int gender, Date birthDay, String hocluc) {
        super(name, gender, birthDay);
        this.School = School;
        this.hocluc = hocluc;
    }
    
    
    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public double getHocbong() {
        return hocbong;
    }

    public void setHocbong(double hocbong) {
        this.hocbong = hocbong;
    }
    
    
    @Override
    public double CalcTax(double income) {
        double tax = income * 0.04;
        return tax;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String ketqua = super.toString();
        
        ketqua += "\nTruong: " + getSchool() +
                 "\nHoc luc: " + getHocluc() +
                 "\nHoc bong: " + getHocbong();
        return ketqua;
    }

    

    

    
    
    
    
}
