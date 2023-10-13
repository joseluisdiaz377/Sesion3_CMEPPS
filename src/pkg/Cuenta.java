package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private double saldo;
	private List<Movimiento> movimientos;

	public Cuenta(int saldo) {
		super();
		this.saldo = saldo;
		this.movimientos = new ArrayList<>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double i) {
		this.saldo = i;
	}

	public void ingresar(double i) {
		saldo += i;
		Movimiento movimiento = new Movimiento(i, "Ingreso", "H");
		movimientos.add(movimiento);
	}

	public boolean retirar(double i) {
		if (saldo - i >= -500) {
			saldo -= i;
			Movimiento movimiento = new Movimiento(i, "Reintegro", "D");
			movimientos.add(movimiento);
			return true;
		} else {
			return false;
		}

	}

}
