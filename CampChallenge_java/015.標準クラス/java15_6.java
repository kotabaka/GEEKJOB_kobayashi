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
public class java15_6 {
    public static void main(String[]args){
        //架空のメールアドレスを宣言
        String addres ="kobayashi@gmail.com";
        //＠以降の文字を取得
        System.out.println(addres.substring(10));
        String addres2 =addres.substring(10);
        System.out.println(addres2.length());
    }
}
