package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;

public class Peon extends Pieza {

	public Peon(Color color, Posicion posicion) {
		super(color, posicion);
	}

	@Override
	public List<Posicion> obtenerJugadasLegales() {
		LinkedList<Posicion> jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila(),
			columna = obtenerPosicion().obtenerColumna();
		Color color = obtenerColor();

		if (obtenerColor() == color.NEGRO) {
		if (fila + 1 == 2) {
			jugadas.add(new Posicion(fila + 2, columna));
		}
		if (fila + 1 >= 1 && fila + 1 <= 7) {
			jugadas.add(new Posicion(fila + 1, columna));
		}
		if (fila + 1 >= 1 && fila + 1 <= 7) {
			jugadas.add(new Posicion(fila + 1, columna + 1));
		}
		if (fila + 1 >= 1 && fila + 1 <= 7) {
			jugadas.add(new Posicion(fila + 1, columna - 1));

			}
		}
		if (obtenerColor() == color.BLANCO) {
			if (fila - 1 == 6) {
			jugadas.add(new Posicion(fila - 2, columna));
		}
		if (fila + 1 >= 0 && fila - 1 <= 5) {
			jugadas.add(new Posicion(fila - 1, columna));
		}
		if (fila + 1 >= 0 && fila - 1 <= 5) {
			jugadas.add(new Posicion(fila - 1, columna + 1));
		}
		if (fila + 1 >= 0 && fila - 1 <= 5) {
			jugadas.add(new Posicion(fila - 1, columna - 1));

			}
		}
		return jugadas;
	}
}