/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java13_2;

/**
 *
 * @author guest1Day
 */
//ひとつ前の課題の親クラスを継承
public class java13_2_2 extends java13_2_1 {
    //メソッド（引数、戻り値なし）フィールドの値をクリアする
    public void syoukyo(){
        this.name=null;
        this.age=0;
    }
    public static void main(String[] args){
        java13_2_1 clear =new java13_2_1();
        clear.hyouji();
    }
}