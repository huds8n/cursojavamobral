package modelos;

public class Interno extends Pessoa {

	private String prontuario;

	private Cela cela;

	public Interno(Pessoa pessoa) {
		setNome(pessoa.getNome());
		setDataNascimento(pessoa.getDataNascimento());
		setCpf(pessoa.getCpf());
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public Cela getCela() {
		return cela;
	}

	public void setCela(Cela cela) {
		this.cela = cela;
	}

}
