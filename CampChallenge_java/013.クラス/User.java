/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java13_3blackjack;

/**
 *
 * @author guest1Day
 */
import java.util.*;

//Userクラスはユーザー（プレイヤー）の機能を持つ。またHumanクラスを継承する。
 class User extends Human {
     
   
     
     //openメソッドを継承。戻り値は手札の合計値
    public int open(){
         int total = 0;
        for (int i = 0; i < this.myCards.size(); i++) {
            total = this.myCards.get(i) + total;
        }
        return total;
     }
     //setCardsメソッドを継承、引いたカードを手札に追加するメソッド
     
     public void setCards(ArrayList<Integer> a){
          for (Integer set : a) {
            this.myCards.add(set);
        }
     }
     
    //checkSumメソッドを継承。まだカードを引くときはtrueもうひかないときはfalseを返す  
    public boolean checkSum(){
            int total = 0;
        for (int i = 0; i < this.myCards.size(); i++) {
            total = (this.myCards.get(i) + total);
        }
        if (total <= 16) {
            return true;
        }
        return false;
    }
 }
