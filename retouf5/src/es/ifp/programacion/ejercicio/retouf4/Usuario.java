package es.ifp.programacion.ejercicio.retouf4;

public class Usuario {
	
//	//Definicion de atributos de la clase Usuario
	 private String nombre;
	    private String apellidos;
	    private String dni;
	    private String correoElectronico;
	    private String telefono;
/**
 * Constructor
 * @param nombre
 * @param apellidos
 * @param dni
 * @param correoElectronico
 * @param telefono
 */
	    public Usuario(String nombre, String apellidos, String dni, String correoElectronico, String telefono) {
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.dni = dni;
	        this.correoElectronico = correoElectronico;
	        this.telefono = telefono;
	    }
/**
 * Metodo get que retorna el nombre de la persona correspondiente
 * @return
 */
	    public String getNombre() {
	        return nombre;
	    }
/**
 * Metodo set con el nombre de la persona correspondiente
 * @param nombre
 */
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
/**
 * Metodo get que retorna los apellidos de la persona correspondiente
 * @return
 */
	    public String getApellidos() {
	        return apellidos;
	    }
/**
 * Metodo set con los apellidos de la persona correspondiente
 * @param apellidos
 */
	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }
/**
 * Metodo get que retorna el dni de la persona correspondiente
 * @return
 */
	    public String getDni() {
	        return dni;
	    }
/**
 *  Metodo set con el dni de la persona correspondiente
 * @param dni
 */
	    public void setDni(String dni) {
	        this.dni = dni;
	    }
/**
 *  Metodo get que retorna el correo de la persona correspondiente
 * @return
 */
	    public String getCorreoElectronico() {
	        return correoElectronico;
	    }
/**
 * Metodo set con el correo de la persona correspondiente
 * @param correoElectronico
 */
	    public void setCorreoElectronico(String correoElectronico) {
	        this.correoElectronico = correoElectronico;
	    }
/**
 * Metodo get que retorna el telefono de la persona correspondiente
 * @return
 */
	    public String getTelefono() {
	        return telefono;
	    }
/**
 * Metodo set con el telefono de la persona correspondiente
 * @param telefono
 */
	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	
	
	
	
	
	
	    }
	
	
	
}
