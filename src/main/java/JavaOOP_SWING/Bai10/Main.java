/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        String input = "20-11-2000";
        Date ngaysinh = df.parse(input);
        
        Student sv = new Student("Khoa hoc Hue", "Minh Nhat", 0, ngaysinh, "Kha");
        
        switch(sv.getHocluc()) {
            case "Xuat sac":
                sv.setHocbong(1000);
                break;
            case "Gioi":
                sv.setHocbong(500);
                break;
            case "Kha":
                sv.setHocbong(100);
                break;
            default:
                sv.setHocbong(0);
                break;
        }
        
        System.out.println(sv);
    }
}
