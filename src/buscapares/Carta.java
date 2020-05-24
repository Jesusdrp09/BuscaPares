/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscapares;

import javax.swing.*;
/**
 *
 * @author Lenovo
 */
public class Carta {
    private int n_imagen;   //numero de la imagen
    private JRadioButton carta;

    public Carta(int n_imagen, JRadioButton carta) {
        this.n_imagen = n_imagen;
        this.carta = carta;
    }

    /**
     * @return the n_imagen
     */
    public int getN_imagen() {
        return n_imagen;
    }

    /**
     * @param n_imagen the n_imagen to set
     */
    public void setN_imagen(int n_imagen) {
        this.n_imagen = n_imagen;
    }

    /**
     * @return the carta
     */
    public JRadioButton getCarta() {
        return carta;
    }

    /**
     * @param carta the carta to set
     */
    public void setCarta(JRadioButton carta) {
        this.carta = carta;
    }
    
}
