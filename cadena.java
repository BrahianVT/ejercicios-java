import java.util.Scanner;
public class cadena{
	public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	String nombre, nombre2;
	int edad, edad2;
	System.out.println("Indica el nombre");
	nombre = teclado.nextLine();
	System.out.println("Indica la edad");
	edad = teclado.nextInt();
	System.out.println("Indica el nombre");
	teclado.nextLine();
	nombre2 = teclado.nextLine();
	System.out.println("Indica la edad");
	edad2 = teclado.nextInt();
	if(edad > edad2)
		System.out.println(nombre + " es mas grande que "+nombre2);
	else
		System.out.println(nombre2 + " es mas grande que "+nombre);
	if(nombre.equalsIgnoreCase(nombre2))
		System.out.println("Son iguales los nombres");
		else
		System.out.println("No son iguales los nombres");
			
	
	}	
}	 