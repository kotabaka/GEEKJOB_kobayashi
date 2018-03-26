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

//Humanクラスは抽象クラス。UserとDealerに共通する情報をまとめて定義しその二つに継承する。抽象メソッドをもつクラスは抽象メソッド？
abstract class Human {
    
    //フィールド「myCards]。UserとDealerが持つ手札の情報
    ArrayList<Integer> myCards =new ArrayList<Integer>();
    
    
    //openメソッド(抽象メソッド、戻り値の型int、引数なし）手札の合計値を計算するメソッド。このメソッドの戻り値は手札の合計値です。
    public abstract int open();
    
    //  setCardメソッド（戻り値の型void、引数の型Arraylist＜Integer>（引いたカード）、引いたカードを手札に追加するメソッド 
    public abstract void setCards(ArrayList<Integer> a);
   
    //checkSumメソッド（戻り値の型boolean、引数なし、まだカードを引くべきか判断するメソッド。引くときはtrue、引かないときはfalseを返す）
    public abstract boolean checkSum();
}
