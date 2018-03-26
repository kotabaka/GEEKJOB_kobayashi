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
import java.util.Random;

//ブラックジャックの舞台。UserクラスやDealerクラスをインスタンス化しメソッドを呼び出しゲームを進める。

public class BlackJack {

    //メインメソッドを作成。その中に処理を記述
    public static void main(String[] args) {
        //まずユーザーとディーラーのインスタンス生成
        Dealer dealer = new Dealer();
        User user = new User();

        //Dealerがdeal
        ArrayList<Integer> dealertehuda = new ArrayList<Integer>();
        for (int i = 0; i < dealer.deal().size(); i++) {
            dealertehuda.add(dealer.deal().get(i));
        }

        //Userがdeal
        ArrayList<Integer> usertehuda = new ArrayList<Integer>();
        for (int i = 0; i < dealer.deal().size(); i++) {
            usertehuda.add(dealer.deal().get(i));
        }

        //DealerがsetCards
        dealer.setCards(dealertehuda);
        System.out.println("ディーラーがディールしました");

        //UserがsetCards
        user.setCards(usertehuda);
        System.out.println("ユーザーがディールしました");
    
        //DealerがcheckSum
        int dealertotal = 0;

        if (dealer.checkSum() == true) {
            while (dealer.checkSum() == true) {
                ArrayList<Integer> dealertehuda2 = new ArrayList<Integer>();
                for (int i = 0; i < dealer.hit().size(); i++) {
                    dealertehuda2.add(dealer.hit().remove(i));
                    dealer.setCards(dealertehuda2);
                    System.out.println("ディーラーがヒットしました");
                }
            }
        }
        dealertotal = dealer.open();
        System.out.println("ディーラーの手札の合計は" + dealertotal + "です");

        
        
        //UserがcheckSum
        int usertotal = 0;

        if (user.checkSum() == true) {
            while (user.checkSum() == true) {
                ArrayList<Integer> usertehuda2 = new ArrayList<Integer>();
                for (int i = 0; i < dealer.hit().size(); i++) {
                    usertehuda2.add(dealer.hit().remove(i));
                    user.setCards(usertehuda2);
                    System.out.println("ユーザーがヒットしました");
                    user.checkSum();
                }
            }
        }
        usertotal = user.open();
        System.out.println("ユーザーの手札の合計は" + usertotal + "です");
            
            
        
        
        if (usertotal>dealertotal&&usertotal<=21) {
            System.out.println("ユーザーの勝ちです");
            
        } else if (usertotal < dealertotal && dealertotal <=21) {
            System.out.println("ディーラーの勝ちです");
        }else{
        System.out.println("この勝負は引き分けです");
        }
    }
   
}