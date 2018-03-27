/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java15_moji;

/**
 *
 * @author guest1Day
 */
public class java15_7 {
    public static void main(String[]args){
        //課題の文をsに入れる
        String s ="きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" ;
        //Iをいに、Uをうに置換した文字列を表示
        String si=s.replace("I","い");
        String siu =si.replace("U", "う");
        System.out.println(siu);
    }
    
}
