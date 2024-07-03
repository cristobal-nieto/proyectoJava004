package es.ifp.programacion.ejercicio.retouf4;
import java.util.HashMap;
import java.util.Map;
public class ProgramaPrincipal {

	/**
	 * Gestión de una empresa:
	 * Para almacenar usuarios se ha creado un hashmap en el ProgramaPrincipal
	 * En la clase Usuario se establecen los atributos,contructores y metodos de la clase usuario.
	 * en el main se crea el hashmap,se introducen los datos de cada usuario,y se añade el usuario l hashmap.
	 * despues se muestran los datos a través del keyset y los metodos de usuario.
	
	
	
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		

		    //aqui creamos le objeto usuario
	        HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();

	        Usuario usuario1 = new Usuario("Emilio", "Delgado", "34675298H", "correoemilio@correo.es", "612123212");
	        Usuario usuario2 = new Usuario("Belén", "López", "92384754J", "correobelen@correo.es", "692928229");

	        usuarios.put(usuario1.getDni(), usuario1);
	        usuarios.put(usuario2.getDni(), usuario2);

	        //aqui recorremos el hashmap 
	        for (String dni : usuarios.keySet()) {
	            Usuario usuario = usuarios.get(dni);
	            System.out.println("DNI: " + dni);
	            System.out.println("Nombre: " + usuario.getNombre());
	            System.out.println("Apellidos: " + usuario.getApellidos());
	            System.out.println("Correo electrónico: " + usuario.getCorreoElectronico());
	            System.out.println("Teléfono: " + usuario.getTelefono());
	            System.out.println();
	        }

		        }
		        
		    
		

		
		
		
		
	}


