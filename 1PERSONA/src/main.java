
public class main {

	public static void main(String[] args) {
		
		persona alumno = new persona();
		persona profesor = new persona();
		persona alumnoPrim = new persona();
		persona alumnoFP = new persona();
		
		
		
		profesor.setNombre("David");
		profesor.setEdad(40);
		
		
		persona.numPersonas++;//con el atributo Static ponemos el clase.atributo
		
		
		alumnoFP.setNombre("Eder");
		alumnoFP.setEdad(26);
		alumnoFP.ageDuplicate();
		alumnoFP.setCountry("Las vegas");
		alumnoFP.newCountry("[EEUU]");
		alumnoFP.numPersonas++;
		
		System.out.println("Datos del alumno");
		System.out.println("Nombre : "+ alumnoFP.getNombre());//acceso a lo definido como publico
		System.out.println("Edad : "+ alumnoFP.getEdad());
		System.out.println("Localidad : "+ alumnoFP.getCountry());
		System.out.println("Numero de personas: " + persona.numPersonas);
		
	}

}
