package practicabaez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practicabaez.model.CascaronServer;
import practicabaez.model.PeticionNombre;
import practicabaez.service.implement.DatosPersonaInterface;

@RestController
@RequestMapping("/datosPersona")
public class DatosPersonaController {

	@Autowired
	private DatosPersonaInterface datosPersonaInterface;
	@PostMapping("/validarFormatoFecha")
	
	public CascaronServer validarFormatoFecha(@RequestBody PeticionNombre request) {
		
	CascaronServer cascaron = new CascaronServer();
	String nombreCompleto = "";
	
	nombreCompleto = datosPersonaInterface.acomodarDatos(request);
	
	if(nombreCompleto.isEmpty()) {
		
		cascaron.setCodigoServidor(500);
		cascaron.setDetalleRespuestaServidor("ERROR");
		cascaron.setRespuestaRest(null);
	} else {
		
		cascaron.setCodigoServidor(200);
		cascaron.setDetalleRespuestaServidor("EXITO");
		cascaron.setRespuestaRest(nombreCompleto);
	} 
	
	return cascaron;
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}