public class Ciudadano extends Persona{
	private String poblacion, provincia;
	private int edad;
	
	public Ciudadano(String nombre , String apellidos, String telefono){
		super(nombre, apellidos, telefono);
		iniciarAtributos();
	}
	//@Override
	protected void iniciarAtributos(){
		setNombre("Un nombre");
		edad = 0;
	}
	public String getPoblacion(){
		return poblacion;
	}
	public void setPoblacion(String poblacion){
		this.poblacion = poblacion;	
	}
	public String getProvincia(){
		return provincia;
	}
	public void setProvincia(String provincia){
		this.provincia = provincia;	
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;	
	}
	
}