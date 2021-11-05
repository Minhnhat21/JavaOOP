/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai09;

/**
 *
 * @author nguye
 */
public class Phuongtrinhbac1 implements Giaiphuongtrinh {
    private double a;
    private double b;
    private double nghiemX;
    private String ketqua;

    public Phuongtrinhbac1() {
    }

    public Phuongtrinhbac1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    
    @Override
    public void giaiPhuongTrinh() {
        if ( a != 0 ) {
            nghiemX = - b/a;
            ketqua = "Phuong trinh co 1 nghiem " + nghiemX ;
        } else {
            if ( b != 0) {
                ketqua = "Phuong trinh vo nghiem";
            } else {
                ketqua = "Phuong trinh co vo so nghiem";
            }
        }
    } 

    @Override
    public String toString() {
        if (ketqua == null || ketqua.isEmpty()) {
            giaiPhuongTrinh();
        }
        return ketqua;
    }
    
    
    
    
}
