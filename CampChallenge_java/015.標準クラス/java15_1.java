/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java15_1;

import java.util.Date;

/**
 *
 * @author guest1Day
 */

public class java15_1 {
    public static void main(String[] args){
        Date someday = new Date(-10*365*24*60*60*1000);
        System.out.println(someday.getTime());
    }
}
