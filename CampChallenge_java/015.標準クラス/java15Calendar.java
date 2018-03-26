/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java15_2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class java15Calendar {
    public static void main(String[] args) {
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        System.out.println(
                c.get(Calendar.YEAR) + "年"
                + c.get(Calendar.MONTH) + "月"
                + c.get(Calendar.DAY_OF_MONTH) + "日"
                + c.get(Calendar.HOUR_OF_DAY) + "時"
                + c.get(Calendar.MINUTE) + "分"
                + c.get(Calendar.SECOND) + "秒");
    }
}
