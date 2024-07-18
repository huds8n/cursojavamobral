package modelos;

public class Cela {

	private String descricao;

	private boolean ativo;

	private boolean disciplinar;

	private int qtdVagas;

	private Ala ala;

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

}
