package geometria;

 /**
  * Representa un polígono de tres lados.
  * Está definido por tres puntos en el plano cartesiano.
  * @since 1.0
  */
 public class Triangulo{
 	private Punto a;
 	private Punto b;
 	private Punto c;
 	/**
 	 * Triángulo con todos sus lados de la misma longitud.
 	 */
 	public static final int Equilatero;
 	/**
 	 * Triángulo con todos sus lados de longitud distinta.
 	 */
 	public static final int Escaleno;
 	/**
 	 * Triángulo con exactamente dos lados de la misma longitud.
 	 */
 	public static final int Isosceles;

 /**
  * Crea un constructor por omisión.
  * Crea un triángulo equilátero de lado 1 con vértices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
  */
 	public Triangulo(){
 		 a = new Punto (0,0);
 		 b = new Punto (1,0);
 		 c = new Punto (0.5, (sin(3.1416/3)));
 	}

 /**
  * Crea un triángulo con los tres puntos dados.
  * @param a Es el punto a
  * @param b Es el punto b
  * @param c Es el punto c
  */
 	public Triangulo (Punto a, Punto b, Punto c){
 		this.a = a;
 		this.b = b;
 		this.c = c;
 	}

 /**
  * Determina si los vértices de este triángulo están alineados.
  * @return si están alineados o no
  */
 	public boolean estanAlineados(){
 		return c.estanAlineados(a, b)
 	}

 /**
  * Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
  * @return el tipo de triángulo
  */
 	public String tipoTriangulo(){
 		double d1 = a.distancia(b);
 		double d2 = b.distancia(c);
 		double d3 = c.distancia(a);
 		if (d1 == d2 && d2 == d3){
 			return Equilatero;
 		}else {
 			if (d1 == d2 || d2 == d3 || d3 == d1)
 				return Isosceles;
 		}else{
 			if(d1 != d2 && d2 != d3 && d3 != d1)
 				return Escaleno;
 		}
 	}
 }