
public class Main {

	public static void main(String[] args) {
		
		//Criação do Banco: 
		Banco bancoBrasil = new Banco("Brasil");
		
		Cliente venilton = new Cliente("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		bancoBrasil.adicionarConta(cc);
		bancoBrasil.adicionarConta(poupanca);
		
		
		Cliente guilherme = new Cliente("Guilherme");
		Conta ccGuilherme = new ContaCorrente(guilherme);
		bancoBrasil.adicionarConta(ccGuilherme);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		bancoBrasil.showClientes();
	}

}
