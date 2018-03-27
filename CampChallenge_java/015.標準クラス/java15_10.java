/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java15_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class java15_10 {
    public static void main(String[]args){
        Date d =new Date();
        int math =Math.max(10, 20);
        String s =String.valueOf(math);
         try{
            File fp=new File("text.file");
            FileWriter fw =new FileWriter(fp);
            fw.write("数字の大きさを比較して大きいほうを取得する処理");
            //fw.close();
            
            fw.write("処理を開始します"+d);
            
            
            fw.write(s);
            // System.out.println(math);

            fw.write("処理が終了しました"+d);
            
            fw.close();
            
            File fpp=new File("text.file");
             FileReader fr = new FileReader(fpp);
            BufferedReader br =new BufferedReader(fr);
            System.out.println(br.readLine());
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
            }
}
