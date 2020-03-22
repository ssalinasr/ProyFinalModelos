/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.abstractFactory;

import javax.swing.ImageIcon;

/**
 *
 * @author Christian Galindo
 */
public class AutomovilElectricidad extends Automovil{

    public AutomovilElectricidad(String marca,String modelo, ImageIcon icon, int potencia, double espacio,int precio) {
        super(marca,modelo, icon, potencia, espacio,precio);
    }

    /*
    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "Automovil eléctrico de modelo: " + modelo
                + " de color: " + color + " de potencia: " + potencia
                + " de espacio: " + espacio);
    }*/

    @Override
    public String getDescription() {
        String desc = (
                "Marca: "+ marca + " modelo: " + modelo);
        //System.out.println(desc);
        return desc;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
    
}
