/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atm;

import java.util.Scanner;

/**
 *
 * @author sss
 */
public class Atm {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("ne yapmak istiyorsunuz para yatırma/para cekme/bakiye goruntulume/cıkıs");
        String islemm = sc.nextLine();
        switch (islemm){
          case "bakiye goruntulume": System.out.println("bakiyeniz 10 bin tl dir");break;
          case"para yatırma":System.out.println("ne kadar yuklemek istiyorsunuz"); 
          int para = sc.nextInt();   if(para>0){System.out.println("para yuklendi");}else{System.out.println("gecersiz deger");}              
          break;
          case "para cekme":System.out.println("ne kadar cekmek istiyorsunuz"); int cekmepara = sc.nextInt();if(cekmepara>10.000){System.out.println("gecersiz deger");}
          else{System.out.println("BASARIYLA PARA CEKILDI");}
          case "cikis": System.out.println("cıkılıyor");break;
          default:System.out.println("yanlıs talimat");
          }
          }
            
            
            
            
            
            
        }
        
         
        
                
    

