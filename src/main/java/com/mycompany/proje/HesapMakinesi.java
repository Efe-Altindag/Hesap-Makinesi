/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proje;

import java.util.*;

/**
 *
 * @author bilal
 */
public class HesapMakinesi {
    static Inner inner;
    
    public HesapMakinesi(){
     inner = new Inner();   
    }

        public void toplama() {
            
            System.out.println(inner.topla());
            Scanner sayi  = new Scanner(System.in);
            double y = sayi.nextDouble();
            Scanner sayi1 = new Scanner(System.in);
            double x = sayi1.nextDouble();
            double z = y+x;
            System.out.println(inner.sonuç()+z);
            System.out.println(inner.sorutoplamadevam());
            
        }
    
        public void bölme() {
           
            System.out.println(inner.böl());
            Scanner sayi  = new Scanner(System.in);
            double y = sayi.nextDouble();
            Scanner sayi1 = new Scanner(System.in);
            double x = sayi1.nextDouble();
            double z = y/x;
            System.out.println(inner.sonuç()+z);
            System.out.println(inner.sorubölmedevam());
            
        }
    
        public void çıkarma() {
        
            System.out.println(inner.çıkar()); 
            Scanner sayi  = new Scanner(System.in);
            double y = sayi.nextDouble();
            Scanner sayi1 = new Scanner(System.in);
            double x = sayi1.nextDouble();
            double z = y-x;
            System.out.println(inner.sonuç()+z);
            System.out.println(inner.soruçıkarmadevam());
            
        }
        public void çarpma()  {
   
            System.out.println(inner.çarp());
            Scanner sayi  = new Scanner(System.in);
            double y = sayi.nextDouble();
            Scanner sayi1 = new Scanner(System.in);
            double x = sayi1.nextDouble();
            double z = y*x;
            System.out.println(inner.sonuç()+z);
            System.out.println(inner.soruçarpmadevam());
            
        }
        
        
        public void döngü() {
            System.out.println("Hesap Makinesi");
            int i=0;
            while(i==0) {    
                
                System.out.println(inner.ilksoru());
                
                Scanner scan = new Scanner(System.in);
                String koşul = scan.nextLine();
                
                HesapMakinesi st = new HesapMakinesi();
                
                if (koşul.equalsIgnoreCase("çarpma")){
                    int x=1; 
                    while(x==1){
                        st.çarpma();
                   
                        Scanner scan1 = new Scanner(System.in);
                        String koşul1 = scan1.nextLine();
                   
                        if(koşul1.equalsIgnoreCase("cik"))
                            break;
                   
                        else if(koşul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                        
                        } 
                        System.out.println(inner.çıksoru());
                        Scanner scan1 = new Scanner(System.in);
                        String koşul1 = scan1.nextLine();
                   
                        if(koşul1.equalsIgnoreCase("cik"))
                            break;
                        else if(koşul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                }
                else if(koşul.equalsIgnoreCase("toplama")){
                    int x=1; 
                    while(x==1){
                        st.toplama();
                   
                        Scanner scan1 = new Scanner(System.in);
                        String koşul1 = scan1.nextLine();
                   
                        if(koşul1.equalsIgnoreCase("cik"))
                            break;
                   
                        else if(koşul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                        } 
                        System.out.println(inner.çıksoru());
                        Scanner scan1 = new Scanner(System.in);
                        String koşul1 = scan1.nextLine();
                   
                        if(koşul1.equalsIgnoreCase("cik"))
                            break;
                        else if(koşul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                

                }
                else if(koşul.equalsIgnoreCase("bölme"))  {
                    int x=1; 
                    while(x==1){
                        st.bölme();
                   
                        Scanner scan1 = new Scanner(System.in);
                        String koşul1 = scan1.nextLine();
                   
                        if(koşul1.equalsIgnoreCase("cik"))
                            break;
                   
                        else if(koşul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                        } 
                        System.out.println(inner.çıksoru());
                        Scanner scan1 = new Scanner(System.in);
                        String koşul1 = scan1.nextLine();
                   
                        if(koşul1.equalsIgnoreCase("cik"))
                            break;
                        else if(koşul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                    
                    

                }
                
                else if(koşul.equalsIgnoreCase("cikarma")){
                    int x=1; 
                    while(x==1){
                        st.çıkarma();
                   
                        Scanner scan1 = new Scanner(System.in);
                        String koşul1 = scan1.nextLine();
                   
                        if(koşul1.equalsIgnoreCase("cik"))
                            break;
                   
                        else if(koşul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                        } 
                        System.out.println(inner.çıksoru());
                        Scanner scan1 = new Scanner(System.in);
                        String koşul1 = scan1.nextLine();
                   
                        if(koşul1.equalsIgnoreCase("cik"))
                            break;
                        else if(koşul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                    

                }
                else if(koşul.equalsIgnoreCase("cik")){
                    break;
                    
                }
                else
                    System.out.println(inner.cevap2());
                } 
            
        }
    
        


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        String koşul = scan.nextLine();
 
        HesapMakinesi st = new HesapMakinesi();
        if (koşul.equalsIgnoreCase("çarpma")){
         st.çarpma();
        }
*/
        HesapMakinesi st = new HesapMakinesi();
        //inner = new Inner();
        //System.out.println(inner);
        st.döngü();
        
    }
    public static class Inner {
        public String ilksoru() {
            return "Hangi işleme geçmek istiyorsunuz(toplama,çarpma,bölme,çıkarma,(programdan çıkmak için cik yazabilirsiniz.))";
        }
        public String çıksoru() {
            return "Programdan çıkmak istiyorsanız 'cik' yazınız.Farklı işleme geçmek istiyorsanız 'devam' yazınız.";
        }
        public String cevap(){
            return "'cik' ve ya 'devam' yazmadınız.(devam yazdınız varsayılır.)";
        }
        public String cevap2(){
            return "Yazdığınızı kontrol ediniz.";
        }
        public String soruçarpmadevam(){
            return "Çarpma işlemine devam etmek istiyorsanız 'devam' istemiyorsanız farklı işleme geçmek veya programdan çıkmak istiyorsanız 'cik' yazınız.";
        }
        public String sorubölmedevam(){
            return "Bölme işlemine devam etmek istiyorsanız 'devam' istemiyorsanız farklı işleme geçmek veya programdan çıkmak istiyorsanız 'cik' yazınız.";
        }
        public String sorutoplamadevam(){
            return "Toplama işlemine devam etmek istiyorsanız 'devam' istemiyorsanız farklı işleme geçmek veya programdan çıkmak istiyorsanız 'cik' yazınız.";
        }
        public String soruçıkarmadevam(){
            return "Çıkarma işlemine devam etmek istiyorsanız 'devam' istemiyorsanız farklı işleme geçmek veya programdan çıkmak istiyorsanız 'cik' yazınız.";
        }
        public String böl() {
            return "Bölmek istediğiniz sayıları giriniz(virgüllü sayıları yazabilirisiniz.).";
        }
        public String çarp() {
            return "Çarpmak istedğiniz sayıları giriniz(virgüllü sayıları yazabilirisiniz.).";
        }
        public String topla() {
            return "Toplamak istediğiniz sayıları giriniz(virgüllü sayıları yazabilirisiniz.).";
        }
        public String çıkar(){
            return "Çıkarmak istediğiniz sayıları giriniz(virgüllü sayıları yazabilirisiniz.).";
        }
        public String sonuç(){
            return "Sonuç : ";
        }
    }
    
}
   

