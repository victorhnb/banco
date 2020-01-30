package entidade;

public abstract class ContaBancaria {

	protected int numConta;
	protected double saldo;

	public ContaBancaria(int numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract double sacar(double valor);

	public abstract double depositar(double valor);

	public void transferir(double valor, ContaBancaria conta) {
		if (this instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) this;
			conta.depositar(valor);
			cc.sacar(valor);
		} else {
			ContaPoupanca cp = (ContaPoupanca) this;
			conta.depositar(valor);
			cp.sacar(valor);
		}

	}

	@Override
	public String toString() {
		return "Uma conta foi encontrada número: " + this.numConta;
	}
}
