package administracionBanco;

public class CuentaBanco {
	int numeroCuenta;
	String titular;
	int saldo;
	
	public CuentaBanco(int numeroCuenta, String titular, int saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "CuentaBanco [numeroCuenta=" + numeroCuenta + ", titular="
				+ titular + ", saldo=" + saldo + "]";
	}
	
}
