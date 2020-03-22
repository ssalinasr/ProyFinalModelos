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
public class Video implements Animacion {

    @Override
    public void dibuja() {
        System.out.println("Mostrar el video");
    }

    @Override
    public void click() {
    }

    public void carga() {
        System.out.println("Cargar el vídeo");
    }

    public void reproduce() {
        System.out.println("Reproducir el vídeo");
    }

}
