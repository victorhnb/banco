package entidade;

import excecoes.SaldoInsuficienteException;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {

	private double limite;

	public ContaPoupanca(int numConta, double saldo, double limite) {
		super(numConta, saldo);
		this.limite = limite;
	}

	
	public double getLimite() {
		return limite;
	}
	
	
	@Override
	public double sacar(double valor) {
		if (valor > (this.saldo + limite)) {
			throw new SaldoInsuficienteException("Saldo Insuficiente para saque. ");
		} else if (valor > this.saldo && valor < (this.saldo + limite)) {
			System.out.println("Você está usando seu limite especial total de R$" + this.limite);
			this.saldo = this.saldo + limite;
			return this.saldo -= valor;
		}
		return this.saldo -= valor;
	}

	@Override
	public double depositar(double valor) {
		return this.saldo += valor;
	}

	@Override
	public void mostrarDados() {
		System.out.println("Conta CP: " + this.numConta +  " Saldo: " + this.getSaldo() + 
				" Limite: " + this.limite);

	}

}
