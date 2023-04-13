package filtroFaturas;

import java.util.List;

public class FiltroFatura {
	
	private List<Fatura> listaFaturas;
	
	public FiltroFatura(List<Fatura> listaFaturas) {
		this.listaFaturas = listaFaturas;
	}

	public List<Fatura> getListaFaturas() {
		return listaFaturas;
	}

}
