package semaforo;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giorgio Del Rocca
 */
public class semaforo {
    int g;

    public semaforo(int g) {
        this.g = g;
    }
    synchronized public void p(){ 
    while(g==0){
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    g--;
    }
    synchronized public void v(){
    g++;
    notify();
    }
}
