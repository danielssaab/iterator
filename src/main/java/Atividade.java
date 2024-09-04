public class Atividade {
	private String descricao;
	private boolean realizada;

	public Atividade(String descricao, boolean realizada) {
		this.descricao = descricao;
		this.realizada = realizada;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}
}
