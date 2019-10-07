package chess;

import processing.core.PApplet;

public class Ajedrez extends PApplet {

    public static void main(String[] args) {
        PApplet.main("chess.Ajedrez");
    }

    @Override
    public void settings() {
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        size(ancho, alto);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        int ancho2 = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int ancho = (ancho2 / 8);
        int alto2 = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        int alto = (alto2 / 8);
        for(int i=0;i < ancho; i++){
            for(int k=0;k < alto; k++){
                if ((i%2 != 0 && k%2 != 0) || (i%2 == 0 && k%2 == 0)){
                    fill(0xFFF00000);
                    } else {
                    fill(0xFF000000);
                }
                rect (k * ancho, i * alto, ancho, alto);
            }
        }


    }

}