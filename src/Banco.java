import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	

	public Banco(String nome) {
		super();
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void showClientes() {
		System.out.println("Clientes do banco (" + this.nome + ")" );
		List<String> nomesClientes = contas.stream().map( conta -> conta.cliente.getNome()).toList();
		nomesClientes = nomesClientes.stream().distinct().toList();
		System.out.println(nomesClientes);
	}

}
