
public class Conta {
	Cliente titular;
	int numero;
	double saldo;
	
	public Conta(Cliente p_cliente, int p_numero) {
		titular = p_cliente;
		numero = p_numero;
		saldo = 0;
	}
	public boolean deposito(double valor) {
		saldo += valor ;
		return true;
	}
	public boolean saque(double valor) {
		if (valor > saldo)
			return false;
		saldo -= valor;
		return false;
	}
	public double verSaldo() {
		return saldo;
	}
	
	
	
	
	
	
	
	
	
	
}
