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
public class Worker extends Person{
    private String company;

    public Worker() {

    }

    public Worker(String company, String name, int gender, Date birthDay) {
        super(name, gender, birthDay);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    
}
