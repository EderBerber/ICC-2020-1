package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;
import ajedrez.Tablero;

public class Dama extends Pieza {

	public Dama(Color color, Posicion posicion) {
		super(color, posicion);
	}

	@Override
	public List<Posicion> obtenerJugadasLegales() {
		LinkedList<Posicion> jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila(),
			columna = obtenerPosicion().obtenerColumna();
		Color color = obtenerColor();
		Tablero tab = Tablero.obtenerInstancia();

	
			for (int i = fila-1, j = columna-1; i >= 0 && j >= 0; i--, j--) {			//Diagonal superior izquierda
				Pieza p = tab.obtenerPieza(i, j);
					if(p == null) {
						jugadas.add(new Posicion(i, j));
					}
					else {
						if (p.obtenerColor() != obtenerColor()) {
							jugadas.add(new Posicion(i, j));
						}
						break;
					}
				}

			for (int i = fila-1, j = columna+1; i >= 0 && j <= 7; i--, j++) {			//Diagonal superior derecha
				Pieza p = tab.obtenerPieza(i, j);
					if(p == null) {
						jugadas.add(new Posicion(i, j));
					}
					else {
						if (p.obtenerColor() != obtenerColor()) {
							jugadas.add(new Posicion(i, j));
						}
						break;
					}
				}

			for (int i = fila+1, j = columna-1; i <= 7 && j >= 0; i++, j--) {			//Diagonal inferior izquierda
				Pieza p = tab.obtenerPieza(i, j);
					if(p == null) {
						jugadas.add(new Posicion(i, j));
					}
					else {
						if (p.obtenerColor() != obtenerColor()) {
							jugadas.add(new Posicion(i, j));
						}
						break;
					}
				}

			for (int i = fila+1, j = columna+1; i <= 7 && j <= 7; i++, j++) {			//Diagonal inferior derecha
				Pieza p = tab.obtenerPieza(i, j);
					if(p == null) {
						jugadas.add(new Posicion(i, j));
					}
					else {
						if (p.obtenerColor() != obtenerColor()) {
							jugadas.add(new Posicion(i, j));
						}
						break;
					}
				}

			for (int i = fila-1; i >= 0; i--) {											//Superior
				Pieza p = tab.obtenerPieza(i, columna);
					if(p == null) {
						jugadas.add(new Posicion(i, columna));
					}
					else {
						if (p.obtenerColor() != obtenerColor()) {
							jugadas.add(new Posicion(i, columna));
						}
						break;
					}
				}

			for (int i = fila+1; i <= 7; i++) {											//Inferior
				Pieza p = tab.obtenerPieza(i, columna);
					if(p == null) {
						jugadas.add(new Posicion(i, columna));
					}
					else {
						if (p.obtenerColor() != obtenerColor()) {
							jugadas.add(new Posicion(i, columna));
						}
						break;
					}
				}

			for (int i = columna-1; i >= 0; i--) {											//Izquierda
				Pieza p = tab.obtenerPieza(fila, i);
					if(p == null) {
						jugadas.add(new Posicion(fila, i));
					}
					else {
						if (p.obtenerColor() != obtenerColor()) {
							jugadas.add(new Posicion(fila, i));
						}
						break;
					}
				}

			for (int i = columna+1; i <= 7; i++) {											//Derecha
				Pieza p = tab.obtenerPieza(fila, i);
					if(p == null) {
						jugadas.add(new Posicion(fila, i));
					}
					else {
						if (p.obtenerColor() != obtenerColor()) {
							jugadas.add(new Posicion(fila, i));
						}
						break;
					}
				}
				return jugadas;
		}

	}