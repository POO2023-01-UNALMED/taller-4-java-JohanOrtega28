package classroom;

public class Persona {
	
	long cedula=1;
	String nombre;
	static int totalPersonas;
	
	static {
		totalPersonas = 0;
	}
	
	Persona() {
		cedula = 0;
		totalPersonas++;
	}
	
	Persona(long cedula,String nombre) {
		this.cedula = cedula;
		this.nombre = nombre;
		totalPersonas++;
	}
	
	Persona(String nombre, long cedula) {
		this.cedula = cedula;
		this.nombre = "";
		totalPersonas++;
	}
	
	Persona(long cedula) {
		this.cedula = cedula;
		this.nombre = "";
		totalPersonas++;
	}
	
	Persona(String nombre) {
		this.nombre = "";
		totalPersonas++;
	
	}
	
	long getCedula() {
		return cedula;
	}
	
	String getNombre() {
		return nombre;
	}
	
	void setNombre(String nombre) { 
		this.nombre = nombre; 
	}

}
