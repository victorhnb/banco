package principal;

import entidade.Banco;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;
import entidade.Relatorio;

public class Executavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(3030, 500, 5);
		ContaPoupanca cp = new ContaPoupanca(3020, 500, 300);

		cc.depositar(100);
		System.out.println(cc.getSaldo());
		cc.sacar(100);
		System.out.println(cc.getSaldo());

		cp.depositar(100);
		System.out.println(cp.getSaldo());
		cp.sacar(0);
		System.out.println(cp.getSaldo());

		Relatorio r = new Relatorio();
		r.gerarRelatorio(cc);
		r.gerarRelatorio(cp);
		
		cp.transferir(200, cc);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		Banco b = new Banco();
		
		b.inserir(cc);
		b.inserir(cp);
		b.procurarConta(3030);
		b.procurarConta(0100);
		b.procurarConta(3020);
		
		b.mostrarDados();
		

	}
}