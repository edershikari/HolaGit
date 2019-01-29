// La clase persona contiene los datos de una persona.
public class persona {
	
	public static  int numPersonas; // es la misma para todos los objetos Persona.
	
	
	//atributos o propiedades
	private  String nombre;
	private String apellido;
	private int edad;
	private String address;
	private String country;
	private String tel[];//el atributo puede ser una array
	private String hijos[];
	
	
	//metodos o funciones.Lo que se puede hacer con el objeto.
	//GET para pedir y SET para cambiar.
	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		
		return (this.nombre);
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	public void newCountry(String value) {
		this.country=country+value;
		
	}
	
	public void ageDuplicate() {
		this.edad=this.edad*2;
		

	}
	
}

