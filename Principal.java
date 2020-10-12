import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		String nome = "JOANDERSON TRAJANO";
		String cpf = "000222";
		Date nascimento = new Date();
		Cliente cliente1 = new Cliente (nome, cpf, nascimento);
		Conta conta1 = new Conta (cliente1, 1);
		Conta conta2 = new Conta (cliente1, 2);
		System.out.println("Saldo da conta : "+ conta1.verSaldo());
	 	conta1.deposito(50);
	 	System.out.println("Saldo da conta 1: " + conta1.verSaldo());
	 	System.out.println("Saldo da conta 2: " + conta2.verSaldo());
	 	System.out.println("Tentativa de saque maior que saldo: "+ conta1.saque(200));
	}

}
