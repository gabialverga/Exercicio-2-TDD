package filtro_faturas;

import java.time.LocalDate;

public class Fatura {

	private String codigo;
	private double valor;
	private LocalDate dataFatura;

	public Fatura(String codigo, double valor, LocalDate dataFatura) {
		this.codigo = codigo;
		this.valor = valor;
		this.dataFatura = dataFatura;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getValor() {
		return valor;
	}

	public LocalDate getDataFatura() {
		return dataFatura;
	}

}
