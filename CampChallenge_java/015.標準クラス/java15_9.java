/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java15_file;
import java.io.*;
/**
 *
 * @author guest1Day
 */
public class java15_9 {
     public static void main(String[]args){
        try{
            File fp=new File("text.file");
            FileWriter fw =new FileWriter(fp);
            fw.write("私の名前は小林健人です");
            //FileReader fr = new FileReader(fp);
            //BufferedReader br =new BufferedReader(fr);
            //System.out.println(br.readLine());
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
