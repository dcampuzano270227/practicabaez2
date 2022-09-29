package practicabaez.model;

import lombok.Data;

@Data
public class CascaronServer {

	private int codigoServidor;
	private String detalleRespuestaServidor;
	private Object respuestaRest;
	
	
	public int getCodigoServidor() {
		return codigoServidor;
	}
	public void setCodigoServidor(int codigoServidor) {
		this.codigoServidor = codigoServidor;
	}
	public String getDetalleRespuestaServidor() {
		return detalleRespuestaServidor;
	}
	public void setDetalleRespuestaServidor(String detalleRespuestaServidor) {
		this.detalleRespuestaServidor = detalleRespuestaServidor;
	}
	public Object getRespuestaRest() {
		return respuestaRest;
	}
	public void setRespuestaRest(Object respuestaRest) {
		this.respuestaRest = respuestaRest;
	}
}
