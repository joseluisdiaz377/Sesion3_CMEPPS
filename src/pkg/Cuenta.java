package pkg;

public class Cuenta {
	private double saldo;
	private String titular;
	private String numero;
	

	public Cuenta(int saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double i) {
		this.saldo = i;
	}

	public void ingresar(double i) {
		this.setSaldo(this.getSaldo() + i);
	}

	public void retirar(double i) {
		this.setSaldo(this.getSaldo() - i);

	}

}
