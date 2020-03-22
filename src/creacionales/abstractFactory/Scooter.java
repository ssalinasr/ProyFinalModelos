/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.abstractFactory;

import estructurales.decorator.Vendible;
import javax.swing.ImageIcon;

/**
 *
 * @author Christian Galindo
 */
public abstract class Scooter implements Vendible {
    
    protected String modelo;
    protected ImageIcon icono;
    protected int potencia;
    protected int precio;

    public Scooter(String modelo, ImageIcon icon, int potencia, int precio) {
        this.modelo = modelo;
        this.icono = icon;
        this.potencia = potencia;
        this.precio = precio;
    }
    
    public abstract String mostrarCaracteristicas();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ImageIcon getIcon() {
        return icono;
    }

    public void setColor(ImageIcon icono) {
        this.icono = icono;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
