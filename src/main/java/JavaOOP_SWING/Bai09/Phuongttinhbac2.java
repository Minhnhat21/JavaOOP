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
public class Phuongttinhbac2 implements Giaiphuongtrinh{
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private String ketqua;

    public Phuongttinhbac2() {
    }

    public Phuongttinhbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void giaiPhuongTrinh() {
        if (a == 0) {
            Phuongtrinhbac1 ptbn = new Phuongtrinhbac1(b,c);
            ptbn.giaiPhuongTrinh();
            ketqua = ptbn.getKetqua();
        } else {
            double delta = b * b - 4 * a * c; 
        
            if (delta == 0) {
                x1 = -b / (2*a);
                ketqua = "Phuong trinh co nghiem kep: " + x1;
            } else if (delta > 0) {
                x1 = (-b + Math.sqrt(delta/(2*a)));
                x2 = (-b - Math.sqrt(delta/(2*a)));
                
                ketqua = "\nPhuong trinh co 2 nghiem phan biet: " +
                          "\nNghiem x1 = " + x1 +
                         "\nNghiem x2 = " + x2 ;
            } else {
                ketqua = "Phuong trinh vo nghiem.";
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
