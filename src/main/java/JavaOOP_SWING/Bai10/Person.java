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
public class Person {
    private String name;
    private int gender;
    private Date birthDay;

    public Person() {
    }

    public Person(String name, int gender, Date birthDay) {
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        String ketqua = "Ho va ten: " + getName() +
                "\nGioi tinh: " + getGender() +
                "\nNgay sinh: " + getBirthDay();
        return ketqua;
    }
    
    
            
}
