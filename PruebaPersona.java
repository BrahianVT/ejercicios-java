//package Agenda;
public class PruebaPersona {
	public static void main (String[] args) {
		Persona nuevaPersona =new Persona("Oscar" , "Mirales Pers" , "12345678");
		/**System.out.println("Nombre :" + nuevaPersona.nombre);
		System.out.println("Apellidos :" + nuevaPersona.apellidos);
		System.out.println("Telefono :" + nuevaPersona.telefono);
		
		System.out.println("Ver informacion mediante los metodos :");
		System.out.println("Nombre :" + nuevaPersona.getNombre());
		System.out.println("Apellidos :" + nuevaPersona.getApellidos());
		System.out.println("Telefono :" + nuevaPersona.getTelefono());	
		System.out.println("Instancias creadas :" + nuevaPersona.getInstancias());	*/
		Ciudadano ciudadano = new Ciudadano("Pedro" , "Navajas Xd" , "87654321");
		System.out.println("Nombre :" + ciudadano.getNombre());
	}
}