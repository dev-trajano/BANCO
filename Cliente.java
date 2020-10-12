import java.util.Date;

public class Cliente {
	String nome;
	String cpf,endereco,telefone;
	Date nascimento;
	int agencia;
	int conta;
	
	public Cliente (String p_nome,String p_cpf, Date p_nascimento) {
		nome = p_nome;
		cpf = p_cpf;
		nascimento = p_nascimento;
		
	}
	public void vincularAgencia(int n_agencia) {
		agencia = n_agencia;
		
	}
	public void vincularConta(int n_conta){
		conta = n_conta;
	}











}
