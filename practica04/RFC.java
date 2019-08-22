import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String nombreCompleto = new String();
		String fechaNacimiento = new String();

		System.out.println("Introduce tu nombre completo empezando por tu nombre y dos apellidos: "+nombreCompleto);
		nombreCompleto = leer.nextLine();
		int primerEspacio = nombreCompleto.indexOf(' ');
		char primerNombre = nombreCompleto.charAt(0);
		String segundoNombre = nombreCompleto.substring(primerEspacio+1,primerEspacio+3);
		String apellidosM = segundoNombre.toUpperCase();
		int segundoEspacio = nombreCompleto.lastIndexOf(' ');
		char tercerNombre = nombreCompleto.charAt(segundoEspacio+1);

		System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa" +fechaNacimiento);
		fechaNacimiento = leer.nextLine();
		String año = fechaNacimiento.substring(8,10);
		String mes = fechaNacimiento.substring(3,5);
		String dia = fechaNacimiento.substring(0,2);

		System.out.println("El RFC de "+nombreCompleto+" es "+apellidosM+tercerNombre+primerNombre+año+mes+dia);
	}

}