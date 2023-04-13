package filtroFaturas;

import java.time.LocalDate;

public class Cliente {

	private String nome;
	private LocalDate dataInclusao;
	private String estado;

	public Cliente(String nome, LocalDate dataInclusao, String estado) {
		this.nome = nome;
		this.dataInclusao = dataInclusao;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataInclusao() {
		return dataInclusao;
	}

	public String getEstado() {
		return estado;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
