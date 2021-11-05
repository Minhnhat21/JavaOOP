/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai13;

/**
 *
 * @author nguye
 */
public class Coffeshop {
    private String name;
    private String address;

    public Coffeshop() {
    }

    public Coffeshop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String ketqua;
        ketqua = "\nTen quan: " + getName() +
                 "\nDia chi: " + getAddress();
        return ketqua;
    }
    
    
}
