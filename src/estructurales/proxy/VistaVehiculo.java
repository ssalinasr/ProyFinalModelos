/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales.proxy;

/**
 *
 * @author Christian Galindo
 */
public class VistaVehiculo {

    public void visualizar() {
        Animacion animacion = new AnimacionProxy();
        animacion.dibuja();
        animacion.click();
        animacion.dibuja();
    }
}
