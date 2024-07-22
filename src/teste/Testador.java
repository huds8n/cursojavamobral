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

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("LP");
		pessoa.setCpf("123456789");
		pessoa.setDataNascimento(new Date());

		Funcionario lp = new Funcionario(pessoa);

		Interno custodiado = new Interno(pessoa);

		UnidadePrisional papuda = new UnidadePrisional();
		papuda.setDescricao("Papuda");
		papuda.setQtdeVagas(5);

		Bloco bloco = new Bloco(papuda);
		bloco.setDescricao("Bloco 1");

		Ala ala = new Ala(bloco);
		ala.setAla("Ala 1");

		Cela cela = new Cela(ala);
		cela.setAtivo(true);
		cela.setDescricao("Cela 1");

		cela.alocarNaCela(custodiado);

		cela.imprimirConfere();

		boolean nomeacaoLiberada = cela.liberarNomeacao(lp);

		if (nomeacaoLiberada) {
			papuda.nomearDiretor(lp);
		} else {
			System.out.println("Nomeação não permitida");
		}

	}

}
