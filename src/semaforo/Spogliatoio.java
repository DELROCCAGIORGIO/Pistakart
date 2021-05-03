package semaforo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giorgio Del Rocca
 */
public class Spogliatoio extends Thread{
    semaforo pieno2;
    Pistakart gara;

    public Spogliatoio(semaforo pieno2, Pistakart gara) {
        this.pieno2 = pieno2;
        this.gara = gara;
    }


    @Override
        public void run(){
        pieno2.p();
        System.out.println(" si è messo la tuta e casco ");
        pieno2.v();
        gara.run();
        pieno2.p();
        System.out.println("si è tolto la tuta e casco");
        pieno2.v();
        }
}
