/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proje;

import java.util.Scanner;

/**
 *
 * @author bilal
 */
public class soru {
      

        
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Hotmail girdirip 
        efe4114efe411@hotmail.com
        Kullanici adi : efe4114efe411
        Sunucu : @hotmail yazdırma
        
        System.out.println("E-posta adresinizi giriniz.");
        Scanner s = new Scanner(System.in);
        String b = s.nextLine();
        
        int bul= b.indexOf("@");
        int ara= b.lastIndexOf(".");
        String yaz= b.substring(bul, ara);
        String kuladı=b.substring(0,bul);
        System.out.println("Kullanici adi : "+kuladı);
        System.out.println("Sunucu : "+yaz);
        */
        
        System.out.println("Dairenin alanı ve çevresini bulma programı devam etmek için 'evet' yazınız.");
        
        Scanner s = new Scanner (System.in);
        String x=s.nextLine();
        
        if(x.equalsIgnoreCase("evet")){
            System.out.println("Yarıçap Değerini Giriniz.(Pi 3 olarak alınır.)");
            Scanner y = new Scanner(System.in);
            int r = y.nextInt();
            System.out.println("Dairenin alanı : "+3*r*r);
            System.out.println("Dairenin çevresi : "+r+r*3); 
        }
        else {
            System.out.println("Devam etmek istiyorsanız 'evet' yazınız.");
            x=s.nextLine();
               if(x.equalsIgnoreCase("evet")){
                   System.out.println("Yarıçap Değerini Giriniz.(Pi 3 olarak alınır.)");
                    Scanner y = new Scanner(System.in);
                    int r = y.nextInt();
                    System.out.println("Dairenin alanı : "+3*r*r);
                    System.out.println("Dairenin çevresi : "+r+r*3); 
               }
               else {
                   System.out.println("Lütfen programı tekrar başlatınız ve yazdığınıza dikkat ediniz.");
               }
                   
            }
            
        

        }
        
        /* 1 ile 999 arası olan tek sayıların toplamını bul
        int toplam = 0;
        for (int i = 1;i<1000;i+=2) {
            toplam +=i;
            System.out.println("toplam sonuc : "+toplam+"Toplanan sayı : "+i);
            
        }
            */
        /*Bir işyerinde çalışan işçiler için, işçi adını,
        çalıştığı saat ve saat ücretini giriniz. İsim olarak “SON” girilmesi 
        veri girişinin sonunu göstersin. Her işçinin ismini ve aldığı maaşı hesaplayınız. 
        Bütün işçilerin maaş hesaplaması bittikten sonra,
        işçilere verilen toplam parayı ekrana yazdırınız.
        YAPAMADIM
        */

        /*
        System.out.println("İşçi'lere verilecek para hesabı için 'devam' yazınız.");
        Scanner s = new Scanner (System.in);
        String x=s.nextLine();
        if (x.equalsIgnoreCase("devam")) {
            while(x.equalsIgnoreCase("devam")) {
                System.out.println("İşçi ismini çalıştığı saati ve saat başı aldığı miktarı yazınız.");
                System.out.println("Örnek :Mehmet "
                        + "8 "
                        + "50");
                System.out.println("Tüm işçilerinizi yazdığınızda sonuca baktıktan sonra çıkmak için 'çık' yazınız.");
                Scanner scanner = new Scanner (System.in);
                String b=scanner.nextLine();
                int a=scanner.nextInt();
                int n=scanner.nextInt();
                
                //int saat;
                //int saatbasipara;
                //saat =a.indexOf(" ");
                //saatbasipara =a.lastIndexOf(" ");
            
                //string m =a.substring(saat, saatbasipara);
                //String n =a.substring(saatbasipara);
                int c;
                int z;
                c= a*n;
                System.out.println(b+"'e/a verilen para : "+c);
                z= c;
                
                int v=c+c;
                System.out.println("Toplam verilen para : "+v);
               
                
                    
                
            
                    if(b.equalsIgnoreCase("çık")){
                        
                        break;
                        
        }
            
                }
           
        }
         else {
            
                System.out.println("Devam etmek için devam yazınız.");
                Scanner q = new Scanner (System.in);
                String w=q.nextLine();
                    if(w.equalsIgnoreCase("devam")) {
                        
                    }

                
                    }
                
        
            
        
        /*Klavyeden bir boy uzunluğu isteyiniz. 175’e eşit veya küçükse ekrana 
‘KISA BOYLUSUNUZ.’, 175’den büyükse ekrana “UZUN BOYLUSUNUZ.’ mesajını yazdıracak 
şekilde programı yazınız.
        System.out.println("Boyunuzu Yazınız.");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        
        if(x<=175) {
            System.out.println("Kısa Boylusunuz.");
        }
        else {
            System.out.println("Uzun Boylusunuz.");
        }
        */
        /*
        Scanner scanner = new Scanner(System.in);

        int a,b,c;

        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        a = Math.max(a,b);
        b= Math.max(b,c);
        c= Math.max(a,b);



        System.out.println("Gilen 3 sayidan en buyuyu : "+c);
        */
        
        
        
    }
    

