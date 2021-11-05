/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai13;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.ParseException;
import java.util.Arrays;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);

        Coffeshop[] a = new Coffeshop[] {new Coffeshop("HighLand Coffee","01 Chu Van An"),
                                         new Coffeshop("Kha Coffee","02 Nguyễn Huệ")};
        
        Manager[] manager1 = new Manager[] {new Manager(a, 20000, "Nguyen Van B", 0, df.parse("20-11-1994")),
                                            new Manager(new Coffeshop[] {new Coffeshop("Hai Lua","03 Chu Van An")},
                                                        20000, "Nguyen Van C", 0, df.parse("20-10-1996"))};
        
        
        System.out.println(Arrays.toString(manager1));

    }
}
