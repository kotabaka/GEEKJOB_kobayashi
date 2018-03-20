/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java13;

/**
 *
 * @author guest1Day
 */
public class java13_1_2 {
     //クラス　hitoを作成
        //名前と年齢のフィールドを作成
        public String name;
        public int age;
        
        //二つの引数をもつメソッド。引数の型は上記フィールドと同じ。
        public void Humandata(String n,int a){
        //引数として受け取った値をフィールドに返す
        this.name =n;
        this.age =a;   
        
        }
     //二つのフィールドの値を表示するメソッド
        public void hyouji(){
           System.out.println(this.name);
           System.out.println(this.age);
       }
}
