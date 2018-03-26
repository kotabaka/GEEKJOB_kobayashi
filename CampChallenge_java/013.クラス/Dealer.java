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
import java.util.Random;
import java.util.*;

//Dealerクラスはディーラーの機能を持つ。Userクラスの機能に加えてカードを配る機能も持つ
public class Dealer extends Human {
      //フィールド「cards」ゲームで配る山札
     protected ArrayList<Integer> cards =new ArrayList<Integer>();
     
    
     
    //初期処理。コンストラクタ「Dealer」山札にすべてのカードを追加（13×4=52枚）を追加
    public Dealer() {
        //配列「ハート、ダイヤ、スペード、ジャック」の4つを作る。それらすべてが入っている山札「cards」を作る？（上記フィールド）
        int[] hart = new int[13];
        int[] dia = new int[13];
        int[] spade = new int[13];
        int[] jack = new int[13];
        for (int i = 0; i < 13; i++) {
            hart[i] = (i + 1);
            dia[i] = (i + 1);
            spade[i] = (i + 1);
            jack[i] = (i + 1);
        }
        //ArrayList<Integer> cards = new ArrayList<Integer>();
        for (int i = 0; i < 13; i++) {
            if (i > 9)
            {
                hart[i] = 10;
            }
            cards.add(hart[i]);
        }
        for (int i = 0; i < 13; i++) {
            if (i > 9)
            {
                dia[i] = 10;
            }
            cards.add(dia[i]);
        }
        for (int i = 0; i < 13; i++) {
            if (i > 9)
            {
                spade[i] = 10;
            }
            cards.add(spade[i]);
        }
        for (int i = 0; i < 13; i++) {
            if (jack[i] > 10)
            {
                jack[i] = 10;
            }
            cards.add(jack[i]);
        }
        
        
    }
        
        
    
    
   
    
    //「deal」メソッド（戻り値Arraylist＜Integer>）。山札「cards」からランダムに2枚引き、引いたカードを戻り値とする。
    public ArrayList<Integer> deal(){
        ArrayList<Integer> deal1=new ArrayList<Integer>();
        for(int i=0;i<2;i++){
            Random rand =new Random();
            int index = rand.nextInt(cards.size());
            //int card =cards.remove(index); 
            deal1.add(cards.remove(index));
            //cards.remove(index);
        }
        return deal1;
    }
        
        
    
    
    //「hit」メソッド（戻り値ArrayList<Integer>)。山札「cards」からランダムに1枚引き、引いたカードを戻り値とする
    public ArrayList<Integer> hit() {
        ArrayList<Integer> hit1 = new ArrayList<Integer>();
        Random rand = new Random();
        int index = rand.nextInt(cards.size());
        hit1.add(cards.remove(index));
        //cards.remove(index);
        return hit1;

    }
             
    //openメソッドを継承。戻り値は手札の合計値
    public int open() {
        //最後にopenで合計値を返す
        int total = 0;
        for (int i = 0; i <this.myCards.size(); i++) {
            total = (this.myCards.get(i) + total);
        }
        return total;
    }
    //setCardsメソッドを継承、引いたカードを手札に追加するメソッド

    public void setCards(ArrayList<Integer> a) {
        //setに引いたカードの値を入れて、それをさらにmyCards（手札に入れる）
        //拡張for文。引数a（dealで引いたカード）をsetに一旦いれて、それをmyCardsに入れる。
        //for (Integer set : a){
          //  this.myCards.add(set);
        //}
        for(int i=0;i<a.size();i++){
            this.myCards.add(a.get(i));
        }
    }
    //checkSumメソッドを継承。まだカードを引くときはtrueもうひかないときはfalseを返す
    //16以下はtrue、17以上はfalseを返す

    /**
     *
     * @return
     */
     @Override
    public boolean checkSum() {
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
