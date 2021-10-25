/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai06;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class Student extends Person{
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
    
    
    
    
}
