package practicabaez.model;

import lombok.Data;

@Data
public class RespuestaNombre {

	private String respuestaRest;

	
	
	public String getRespuestaRest() {
		return respuestaRest;
	}

	public void setRespuestaRest(String respuestaRest) {
		this.respuestaRest = respuestaRest;
	}
	
}
