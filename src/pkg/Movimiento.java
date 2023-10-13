package pkg;

public class Movimiento {
	private double importe;
	private String detalle;	
	private String signo;  //D sacar  -- H meter

	public Movimiento(double importe, String detalle, String signo) {
		this.importe = importe;
		this.detalle = detalle;
		this.signo = signo;
		
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}
	
	

}
