package entidade;

import java.util.ArrayList;
import java.util.List;

public class Banco implements Imprimivel{

	List<ContaBancaria> contas = new ArrayList<ContaBancaria>();

	public void inserir(ContaBancaria conta) {
		contas.add(conta);
	}

	public void remover(ContaBancaria conta) {
		if (conta instanceof ContaCorrente) {
			System.out.println("Conta Corrente: " + conta.getNumConta() + " excluida com sucesso" );
			contas.remove(conta);
		}
		else if (conta instanceof ContaPoupanca) {
			System.out.println("Conta Poupanca: " + conta.getNumConta() + " excluida com sucesso" );

		}
		else {System.out.println("Conta não encontrada.");}
	}

	public ContaBancaria procurarConta(int numeroConta) {
		for (int i = 0; i < contas.size(); i++) 
			if (contas.get(i).getNumConta() == numeroConta) 
				return contas.get(i); 
	
			return null;
		}

	@Override
	public void mostrarDados() {
		for (ContaBancaria conta : contas) {
			System.out.println(conta);
		}
	}

}