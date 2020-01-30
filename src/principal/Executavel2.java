package principal;

import java.util.Scanner;

import entidade.Banco;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Executavel2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Banco b1 = new Banco();
		ContaCorrente c1 = new ContaCorrente(3020, 0, 5);
		b1.inserir(c1);
		
		System.out.println("digite as opções para os seguintes menus: ");
		System.out.println("1 - Criar conta: \n"
				+ "2 - Selecionar conta: \n"
				+"3 - Remover conta\n"
				+ "4 - Gerar relatorio\n"
				+ "5 - Finalizar \n");
		int opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("Digite 1 - para Conta Corrente, e 2 - para Conta Poupança");
			int op_conta = sc.nextInt();
			if(op_conta == 1) {
				ContaCorrente cc =  new ContaCorrente(1010, 0, 5);
				System.out.println("Conta Concorrente criada com sucesso");
			
			}
			else {
				ContaPoupanca cp = new ContaPoupanca(2010, 0, 300);
				System.out.println("Conta Poupança criada com sucesso.");
			}
		
		
		}
		
		else if (opcao == 2) {
			System.out.println("Digite o numero da sua conta: ");
			int conta = sc.nextInt();
			System.out.println(b1.procurarConta(conta));
		}
		
		else if (opcao == 3) {
			System.out.println("Digite o numero da conta para remover: ");
			int numConta = sc.nextInt();
			b1.remover(b1.procurarConta(numConta));
		}
		
		else if (opcao ==4) {
			b1.mostrarDados();
		}
		
		
		else if (opcao == 5) {
			System.out.println("Sessão finalizada. ");
		}

		
		else {
			System.out.println("Opção desconhecida");
		}
		
	sc.close();
	}
	

}
