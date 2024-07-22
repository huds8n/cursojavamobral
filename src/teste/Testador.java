package teste;

import java.util.Date;

import modelos.Ala;
import modelos.Bloco;
import modelos.Cela;
import modelos.Funcionario;
import modelos.Interno;
import modelos.Pessoa;
import modelos.UnidadePrisional;

public class Testador {

	public static void main(String[] args) {

		Pessoa gerson = new Pessoa();
		gerson.setNome("Gerson");
		gerson.setCpf("123456789");

		Funcionario diretor = new Funcionario(gerson);

		UnidadePrisional papuda = new UnidadePrisional();
		papuda.setDescricao("Papuda");
		papuda.setQtdeVagas(5);
		papuda.nomearDiretor(diretor);

		Bloco bloco = new Bloco(papuda);
		bloco.setDescricao("Bloco 1");

		Ala ala = new Ala(bloco);
		ala.setAla("Ala 1");

		Cela cela = new Cela(ala);
		cela.setAtivo(true);
		cela.setDescricao("Cela 1");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("LP");
		pessoa.setCpf("123456789");
		pessoa.setDataNascimento(new Date());

		Funcionario lp = new Funcionario(pessoa);
		System.err.println("O nome do funcionario é: " + lp.getNome());

		Interno custodiado = new Interno(pessoa);
		System.err.println("O nome do custodiado é: " + custodiado.getNome());

		cela.alocarNaCela(custodiado);

	}

}
