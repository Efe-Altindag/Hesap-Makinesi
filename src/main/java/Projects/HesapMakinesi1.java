/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

import java.util.*;

/**
 *
 * @author bilal
 */
public class HesapMakinesi1 {
    static Inner inner;
    
    public HesapMakinesi1(){
     inner = new Inner();   
    }

        public void toplama() {
            
            System.out.println(inner.topla());
            Scanner sayi  = new Scanner(System.in);
            double y = sayi.nextDouble();
            Scanner sayi1 = new Scanner(System.in);
            double x = sayi1.nextDouble();
            double z = y+x;
            System.out.println(inner.sonuc()+z);
            System.out.println(inner.sorutoplamadevam());
            
        }
    
        public void bolme() {
           
            System.out.println(inner.bol());
            Scanner sayi  = new Scanner(System.in);
            double y = sayi.nextDouble();
            Scanner sayi1 = new Scanner(System.in);
            double x = sayi1.nextDouble();
            double z = y/x;
            System.out.println(inner.sonuc()+z);
            System.out.println(inner.sorubolmedevam());
            
        }
    
        public void cikarma() {
        
            System.out.println(inner.cikar()); 
            Scanner sayi  = new Scanner(System.in);
            double y = sayi.nextDouble();
            Scanner sayi1 = new Scanner(System.in);
            double x = sayi1.nextDouble();
            double z = y-x;
            System.out.println(inner.sonuc()+z);
            System.out.println(inner.sorucikarmadevam());
            
        }
        public void carpma()  {
   
            System.out.println(inner.carp());
            Scanner sayi  = new Scanner(System.in);
            double y = sayi.nextDouble();
            Scanner sayi1 = new Scanner(System.in);
            double x = sayi1.nextDouble();
            double z = y*x;
            System.out.println(inner.sonuc()+z);
            System.out.println(inner.sorucarpmadevam());
            
        }
        
        
        public void dongu() {
            System.out.println(inner.makine());
            int i=0;
            while(i==0) {    
                
                System.out.println(inner.ilksoru());
                
                Scanner scan = new Scanner(System.in);
                String kosul = scan.nextLine();
                
                HesapMakinesi1 st = new HesapMakinesi1();
                
                if (kosul.equalsIgnoreCase("carpma")){
                    int x=1; 
                    while(x==1){
                        st.carpma();
                   
                        Scanner scan1 = new Scanner(System.in);
                        String kosul1 = scan1.nextLine();
                   
                        if(kosul1.equalsIgnoreCase("cik"))
                            break;
                   
                        else if(kosul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                        
                        } 
                        System.out.println(inner.ciksoru());
                        Scanner scan1 = new Scanner(System.in);
                        String kosul1 = scan1.nextLine();
                   
                        if(kosul1.equalsIgnoreCase("cik"))
                            break;
                        else if(kosul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                }
                else if(kosul.equalsIgnoreCase("toplama")){
                    int x=1; 
                    while(x==1){
                        st.toplama();
                   
                        Scanner scan1 = new Scanner(System.in);
                        String kosul1 = scan1.nextLine();
                   
                        if(kosul1.equalsIgnoreCase("cik"))
                            break;
                   
                        else if(kosul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                        } 
                        System.out.println(inner.ciksoru());
                        Scanner scan1 = new Scanner(System.in);
                        String koşul1 = scan1.nextLine();
                   
                        if(koşul1.equalsIgnoreCase("cik"))
                            break;
                        else if(koşul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                

                }
                else if(kosul.equalsIgnoreCase("bolme"))  {
                    int x=1; 
                    while(x==1){
                        st.bolme();
                   
                        Scanner scan1 = new Scanner(System.in);
                        String kosul1 = scan1.nextLine();
                   
                        if(kosul1.equalsIgnoreCase("cik"))
                            break;
                   
                        else if(kosul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                        } 
                        System.out.println(inner.ciksoru());
                        Scanner scan1 = new Scanner(System.in);
                        String kosul1 = scan1.nextLine();
                   
                        if(kosul1.equalsIgnoreCase("cik"))
                            break;
                        else if(kosul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                    
                    

                }
                
                else if(kosul.equalsIgnoreCase("cikarma")){
                    int x=1; 
                    while(x==1){
                        st.cikarma();
                   
                        Scanner scan1 = new Scanner(System.in);
                        String kosul1 = scan1.nextLine();
                   
                        if(kosul1.equalsIgnoreCase("cik"))
                            break;
                   
                        else if(kosul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                        } 
                        System.out.println(inner.ciksoru());
                        Scanner scan1 = new Scanner(System.in);
                        String kosul1 = scan1.nextLine();
                   
                        if(kosul1.equalsIgnoreCase("cik"))
                            break;
                        else if(kosul1.equalsIgnoreCase("devam"))
                            continue;
                        else 
                            System.out.println(inner.cevap());
                    

                }
                else if(kosul.equalsIgnoreCase("cik")){
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
 
        HesapMakinesi1 st = new HesapMakinesi1();
        if (koşul.equalsIgnoreCase("çarpma")){
         st.çarpma();
        }
*/
        HesapMakinesi1 st = new HesapMakinesi1();
        //inner = new Inner();
        //System.out.println(inner);
        st.dongu();
        
    }
    public static class Inner {
        public String makine() {
            return "Hesap Makinesi";
        }
        public String ilksoru() {
            return "Hangi isleme gecmek istiyorsunuz(toplama,carpma,bolme,cikarma,(programdan cikmak icin 'cik' yazabilirsiniz.))";
        }
        public String ciksoru() {
            return "Programdan cikmak istiyorsaniz 'cik' yaziniz.Farkli isleme gecmek istiyorsaniz 'devam' yaziniz.";
        }
        public String cevap(){
            return "'cik' veya 'devam' yazmadiniz.(devam yazdiniz varsayilir.)";
        }
        public String cevap2(){
            return "Yazdiginizi kontrol ediniz.";
        }
        public String sorucarpmadevam(){
            return "Carpma islemine devam etmek istiyorsaniz 'devam' istemiyorsaniz farkli isleme gecmek veya programdan cikmak istiyorsaniz 'cik' yaziniz.";
        }
        public String sorubolmedevam(){
            return "Bolme islemine devam etmek istiyorsaniz 'devam' istemiyorsaniz farkli isleme gecmek veya programdan cikmak istiyorsaniz 'cik' yaziniz.";
        }
        public String sorutoplamadevam(){
            return "Toplama islemine devam etmek istiyorsaniz 'devam' istemiyorsaniz farkli isleme gecmek veya programdan cikmak istiyorsaniz 'cik' yaziniz.";
        }
        public String sorucikarmadevam(){
            return "Cikarma islemine devam etmek istiyorsaniz 'devam' istemiyorsaniz farkli isleme gecmek veya programdan cikmak istiyorsaniz 'cik' yaziniz.";
        }
        public String bol() {
            return "Bolmek istediginiz sayilari giriniz(virgullu sayilari yazabilirisiniz.).";
        }
        public String carp() {
            return "Carpmak istediginiz sayilari giriniz(virgullu sayilari yazabilirisiniz.).";
        }
        public String topla() {
            return "Toplamak istediginiz sayilari giriniz(virgullu sayilari yazabilirisiniz.).";
        }
        public String cikar(){
            return "Cikarmak istediginiz sayilari giriniz(virgullu sayilari yazabilirisiniz.).";
        }
        public String sonuc(){
            return "Sonuc : ";
        }
    }
    
}
   

