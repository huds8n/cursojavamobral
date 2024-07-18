package modelos;

import java.util.ArrayList;
import java.util.List;

public class Bloco {

	private String descricao;

	private UnidadePrisional unidadePrisional;
	
	private List<Ala> alas = new ArrayList<>();

	// CONSTRUTOR
	public Bloco(UnidadePrisional presidio) {
		this.unidadePrisional = presidio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String novoDescricao) {
		this.descricao = novoDescricao;
	}

	public UnidadePrisional getUnidadePrisional() {
		return unidadePrisional;
	}

	public void setUnidadePrisional(UnidadePrisional unidadePrisional) {
		this.unidadePrisional = unidadePrisional;
	}

	public List<Ala> getAlas() {
		return alas;
	}

	public void setAlas(List<Ala> alas) {
		this.alas = alas;
	}

}
