/**
 * Sirve para declarar un título, autor y año de publicación de un libro,
 * poder modificarlo y poder ver qué elemento es (título, autor o año de publicación) del libro.
 * @author Berber Gutiérrez Eder Samuel
 * @version 1.0
 */
public class Libro{
	private String titulo;
	private String autor;
	private String añoDePublicacion;

/**
 * Se crea un objeto y se le asignaron...
 * al atributo titulo se le asignó "No se ha asignado un título"
 * al atributo autor se le asignó "No se ha asignado un autor"
 * al atributo añoDePublicacion se le asignó "No se ha asignado un año de publicación"
 */
	public Libro (){
		titulo="No se ha asignado un título";
		autor="No se ha asignado un autor";
		añoDePublicacion="No se ha asignado un año de publicación";
	}

/**
 * Se crea un objeto y se le asignan parámetros
 * @param titulo titulo
 * @param autor autor
 * @param añoDePublicacion añoDePublicacion
 */
	public Libro(String titulo, String autor, String añoDePublicacion){
		this.titulo=titulo;
		this.autor=autor;
		this.añoDePublicacion=añoDePublicacion;
	}

/**
 * Asigna un nuevo título
 * @param titulo el nuevo título
 */
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}

/**
 * Asigna un nuevo autor
 * @param autor el nuevo autor
 */
	public void setAutor(String autor){
		this.autor=autor;
	}

/**
 * Asigna un nuevo año de publicación
 * @param añoDePublicacion el nuevo año de publicación
 */
	public void setAñoDePublicacion(String añoDePublicacion){
		this.añoDePublicacion=añoDePublicacion;
	}

/**
 * Regresa el título
 * @param titulo el título
 */
	public String getTitulo(){
		return titulo;
	}

/**
 *Regresa el autor
 * @param autor el autor
 */
	public String getAutor(){
		return autor;
	}

/**
 * Regresa el año de publicación
 * @param añoDePublicacion el año de publicación
 */
	public String getAñoDePublicacion(){
		return añoDePublicacion;
	}

}