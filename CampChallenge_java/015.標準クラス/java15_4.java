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
public class java15_4 {
     public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2015,0,1,0,0,0);
        
        Calendar b = Calendar.getInstance();
        b.set(2015,12,31,23,59,59);
        
        Date d =c.getTime();
        Date e =b.getTime();
        
        System.out.println(e.getTime()-d.getTime());
     }
     }
