/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

/**
 *
 * @author Giorgio Del Rocca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       semaforo spogl=new semaforo(2);
       semaforo gara=new semaforo(4);
       
       Pistakart a=new Pistakart(gara,"Pilota 1");
       Thread Pilota_1=new Spogliatoio(spogl,a);
       Pistakart b=new Pistakart(gara,"Pilota 2");
       Thread Pilota_2=new Spogliatoio(spogl,b);
       Pistakart c=new Pistakart(gara,"Pilota 3");
       Thread Pilota_3=new Spogliatoio(spogl,c);
       Pistakart d=new Pistakart(gara,"Pilota 4");
       Thread Pilota_4=new Spogliatoio(spogl,d);
       Pistakart e=new Pistakart(gara,"Pilota 5");
       Thread Pilota_5=new Spogliatoio(spogl,e);
        Pistakart f=new Pistakart(gara,"Pilota 6");
       Thread Pilota_6=new Spogliatoio(spogl,f);
        Pistakart g=new Pistakart(gara,"Pilota 7");
       Thread Pilota_7=new Spogliatoio(spogl,g);
        Pistakart h=new Pistakart(gara,"Pilota 8");
       Thread Pilota_8=new Spogliatoio(spogl,h);
       
       
       Pilota_1.start();
       Pilota_2.start();
       Pilota_3.start();
       Pilota_4.start();
       Pilota_5.start();
       Pilota_6.start();
       Pilota_7.start();
       Pilota_8.start();
      
       
       
    }
    
}
