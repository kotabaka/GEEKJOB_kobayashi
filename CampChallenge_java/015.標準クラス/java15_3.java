/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java15_3;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author guest1Day
 */
public class java15_3 {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2016, 10, 04, 10, 00, 00);
        System.out.println(c.getTime());
        
        Date d = c.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = sdf.format(d);

        System.out.print(dateString);

    }
}
