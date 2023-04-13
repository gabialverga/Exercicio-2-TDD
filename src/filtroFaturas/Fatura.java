package filtroFaturas;

import java.time.LocalDate;

public class Fatura {

	private String codigo;
	private double valor;
	private LocalDate dataFatura;
	private Cliente cliente;

	public Fatura(String codigo, double valor, LocalDate dataFatura, Cliente cliente) {
		this.codigo = codigo;
		this.valor = valor;
		this.dataFatura = dataFatura;
		this.cliente = cliente;
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

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setDataFatura(LocalDate dataFatura) {
		this.dataFatura = dataFatura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
