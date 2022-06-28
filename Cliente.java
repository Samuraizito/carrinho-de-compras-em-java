
public class Cliente {
	private String nome;
	private String orcamento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(String orcamento) {
		this.orcamento = orcamento;
	}

	public void getCarrinho() {
		System.out.println("ola senhor(a) " + this.nome + " seu orcamento e de " + this.orcamento);
	}
}
