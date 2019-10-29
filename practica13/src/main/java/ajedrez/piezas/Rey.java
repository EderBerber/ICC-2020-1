package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;

public class Rey extends Pieza {
	public Rey(Color color, Posicion posicion) {		//Implicito (sin los parámetros, Java añade ese constructor cuando no ve ninguno)
		super(color, posicion);		//Se va a invocar al constructor de la superclase
	}

	@Override
	public List<Posicion> obtenerJugadasLegales() {
		LinkedList<Posicion> jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila(),
			columna = obtenerPosicion().obtenerColumna();
		if (fila - 1 >= 0 && columna - 1 >= 0) {			//superior izquierda A
			jugadas.add(new Posicion(fila - 1, columna - 1));
		}
		if (fila - 1 >= 0 && columna - 1 >= 0) {			//superior A
			jugadas.add(new Posicion(fila -1, columna));
		}
		if (fila - 1 >= 0 && columna - 1 >= 0) {			//superior derecha A
			jugadas.add(new Posicion(fila - 1, columna + 1));
		}
		if (fila - 1 >= 0 && columna - 1 >= 0) {			//derecha A
			jugadas.add(new Posicion(fila, columna + 1));
		} 
		if (fila - 1 >= 0 && columna - 1 >= 0) {			//inferior derecha A
			jugadas.add(new Posicion(fila + 1, columna + 1));
		} 
		if (fila - 1 >= 0 && columna - 1 >= 0) {			//inferior A
			jugadas.add(new Posicion(fila + 1, columna));
		} 
		if (fila - 1 >= 0 && columna - 1 >= 0) {			//inferior izquierda A
			jugadas.add(new Posicion(fila + 1, columna - 1));
		} 
		if (fila - 1 >= 0 && columna - 1 >= 0) {			//izquierda A
			jugadas.add(new Posicion(fila, columna - 1));
		} 
		if (columna + 1 <= 7){								//B
			jugadas.add(new Posicion(fila, columna + 1));
		}
		if (fila +1 <= 7) {
			jugadas.add(new Posicion(fila + 1, columna));
		}
		return jugadas;
	}
}