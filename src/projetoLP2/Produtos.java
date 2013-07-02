package projetoLP2;

public class Produtos {

	private int cod;
	private String nome;
	private String quantidade;

	public Produtos(int cod, String nome, String quantidade) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String toString() {
		return "Produtos [cod=" + cod + ", nome=" + nome + ", quantidade=" + quantidade + "]";
	}

}
