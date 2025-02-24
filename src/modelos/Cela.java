package modelos;

import java.util.ArrayList;
import java.util.List;

public class Cela {

	private String descricao;

	private boolean ativo;

	private boolean disciplinar;

	private int qtdVagas;

	private Ala ala;

	private List<Interno> internosDaCela = new ArrayList<Interno>();

	public Cela(Ala alaPertencente) {
		this.ala = alaPertencente;

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean isDisciplinar() {
		return disciplinar;
	}

	public void setDisciplinar(boolean disciplinar) {
		this.disciplinar = disciplinar;
	}

	public int getQtdVagas() {
		return qtdVagas;
	}

	public void setQtdVagas(int qtdVagas) {
		this.qtdVagas = qtdVagas;
	}

	public Ala getAla() {
		return ala;
	}

	public void setAla(Ala ala) {
		this.ala = ala;
	}

	public void alocarNaCela(Interno interno) {
		if (ativo == false) {
			System.out.println("Cela inativa - Impossivel Alocar Custodiado");
		} else {
			this.internosDaCela.add(interno);
		}
	}

	public void imprimirConfere() {
		System.err.println("Imprimindo Confere da Cela");
		for (Interno interno : internosDaCela) {
			System.out.println("Custodiado Alocaco: " + interno.getNome());
		}
	}

	public boolean liberarNomeacao(Funcionario diretor) {
		for (Interno internoConfere : internosDaCela) {
			if (diretor.getCpf().equals(internoConfere.getCpf())) {
				System.out.println("O Custodiado N�o pode ser nomeado Diretor da Unidade");
				return false;
			}
		}

		return true;
	}

}
