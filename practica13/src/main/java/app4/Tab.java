package app4;

import processing.core.PApplet;
import processing.core.PImage;
import java.util.HashMap;
import ajedrez.Tablero;
import ajedrez.piezas.Color;
import ajedrez.piezas.Pieza;
import ajedrez.piezas.Peon;
import ajedrez.piezas.Dama;

public class Tab extends PApplet {

    private Tablero tablero;
    private HashMap<String, PImage> imagenes;

    public static void main(String[] args) {
        PApplet.main("app4.Tab");
    }

    @Override
    public void settings() {
       /** int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        size(ancho, alto);
        */
        size(displayHeight * 4 / 5, displayHeight * 4 / 5);
    }

    @Override
    public void setup() {
        tablero = Tablero.obtenerInstancia();
        imagenes = new HashMap<>();
        imagenes.put("PeonBLANCO",
                      loadImage(getClass().getResource("/w-pawn.png").getPath()));
        imagenes.put("PeonNEGRO",
                      loadImage(getClass().getResource("/b-pawn.png").getPath()));
        imagenes.put("DamaBLANCO",
                      loadImage(getClass().getResource("/w-queen.png").getPath()));
        imagenes.put("DamaNEGRO",
                      loadImage(getClass().getResource("/b-queen.png").getPath()));
        noLoop();
    }

    @Override
    public void draw() {
     /**   int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        for(int i=0;i < (ancho/8); i++){
            for(int k=0;k < (alto/8); k++){
                if ((i%2 != 0 && k%2 != 0) || (i%2 == 0 && k%2 == 0)){
                    fill(0xFFF00000);
                    } else {
                    fill(0xFF000000);
                }
                rect (k * (ancho/8), i * (alto/8), ancho/8, alto/8);
                */
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    fill(0xFF00FFF0);

                } else {
                    fill(0xFFFFFFFF);
                }
                rect (j * (height / 8), i * (height / 8), height / 8, height / 8);

                Pieza pieza = tablero.obtenerPieza(i, j);
                if (pieza != null) {
                    image(imagenes.get(pieza.getClass().getSimpleName() + pieza.obtenerColor()), j * (height / 8), i * (height / 8), height / 8, height / 8);
                } 
            }
        }
    }

}