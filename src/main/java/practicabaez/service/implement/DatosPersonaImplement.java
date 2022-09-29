package practicabaez.service.implement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import practicabaez.model.PeticionNombre;
@Service
public class DatosPersonaImplement implements DatosPersonaInterface {

	@Override
	public String acomodarDatos(PeticionNombre request) {
		
		String nombreCompleto = "";
		
	
		String fechaNacimiento = request.getFechaNacimiento();
		String [] arrayFecha = fechaNacimiento.split("/");
		
		if(arrayFecha[0].length() == 2) {
			
			
			if(ValidarFormatoFecha(request.getFechaNacimiento()) != null) {
				nombreCompleto = request.getNombre() + " | " + request.getApellidoPaterno() + " | " + request.getApellidoMaterno() 
				+ " || " + request.getFechaNacimiento();
				
				
			}
			
		}
		
		
		
						
		return nombreCompleto;
		
		
	}
	
	public static Date ValidarFormatoFecha(String fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			return formatter.parse(fecha);
			
		}catch (ParseException e) {
			
			
			e.printStackTrace();
			return null;
		}
		
	
	}
		
		
	}
	



