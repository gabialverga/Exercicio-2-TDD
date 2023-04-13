package filtro_faturas;

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

}
