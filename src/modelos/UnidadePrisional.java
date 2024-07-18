package modelos;

import java.util.ArrayList;
import java.util.List;

public class UnidadePrisional {

	private String descricao;

	private int qtdeVagas;

	private boolean status;

	private List<Bloco> blocos = new ArrayList<Bloco>();

	public UnidadePrisional() {

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdeVagas() {
		return qtdeVagas;
	}

	public void setQtdeVagas(int qtdeVagas) {
		this.qtdeVagas = qtdeVagas;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<Bloco> getBlocos() {
		return blocos;
	}

	public void setBlocos(List<Bloco> blocos) {
		this.blocos = blocos;
	}

}
