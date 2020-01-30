package entidade;

import excecoes.SaldoInsuficienteException;

public class ContaCorrente extends ContaBancaria implements Imprimivel{

	private double taxaDeOperacao;


	
	
	public ContaCorrente(int numConta, double saldo, double taxaDeOperacao) {
		super(numConta, saldo);
		this.taxaDeOperacao = taxaDeOperacao;
	}

	
	public double getTaxaDeOperacao() {
	return taxaDeOperacao;
	}
	
	
	
	@Override
	public double sacar(double valor) throws SaldoInsuficienteException {
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente. ");
		}
			return this.saldo = (this.saldo - valor) - taxaDeOperacao;
	}

	@Override
	public double depositar(double valor) {
		return this.saldo = (this.saldo + valor) - taxaDeOperacao;
	}

	@Override
	public void mostrarDados() {
		System.out.println("Conta CC: " + this.numConta +  " Saldo: "+this.getSaldo() + 
				" Taxa de operação: " + this.taxaDeOperacao);
		
	}

}
