//package Agenda;
/**
* Implementacion de un clase persona
* Esta clase describe a un nuevo contacto en una agenda
* de telefonos
* @author Brahian Velazquez Tellez
* @version 1.0
*/
public class Persona{
	private String nombre , apellidos, telefono;
	private static int nIntancias = 0;
	/**
	* Constructor con parametros.
	* @param nombre Nombre del nuevo contacto
	* @param apellidos Apellidos del nuevo contacto
	* @param telefono Telefonos del nuevo contacto
 	*/
	Persona(String nombre , String apellidos, String telefono){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		nIntancias++;
	}
	/**
	* Devuelve el numero de instancias creadas
	* @return El numero de instancias
 	*/
	public static int getInstancias(){
		return nIntancias;
	}
	/**
	* Devuelve el nombre del contacto
	* @return Nombre del contacto
 	*/
	String getNombre(){
		return nombre;
	}
	/**
	* Devuelve los apellidos del contacto
	* @return Apellidos del contacto
 	*/
	String getApellidos(){
		return apellidos;
	}
	/**
	* Devuelve el telefono del contacto
	* @return Telefono del contacto
 	*/
	String getTelefono(){
		return telefono;
	}
	/**
	* Cambia el nombre del contacto
	* @param nombre El nuevo nombre del contacto
	* @deprecated Solo por ahora se podra modificar
	* @see Persona(String nombre , String apellidos, String telefono){	
 	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		/**
	* Cambia los apellidos del contacto
	* @param apellidos El nuevo nombre del contacto
	* @deprecated Solo por ahora se podra modificar
	* @see #Persona(String nombre , String apellidos, String telefono){	
 	*/
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
		/**
	* Cambia el telefono del contacto
	* @param nombre El nuevo nombre del contacto
	*/
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}