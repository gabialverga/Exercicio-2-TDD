package filtroFaturas;

import java.util.ArrayList;
import java.util.List;

public class FiltroFatura {
	
	private List<Fatura> listaFaturas;
	
	public FiltroFatura(List<Fatura> listaFaturas) {
		this.listaFaturas = listaFaturas;
	}

	public List<Fatura> getListaFaturas() {
		return listaFaturas;
	}
	
	public void setFaturas(Fatura fatura) {
		listaFaturas.add(fatura);
	}

	public void removerFaturasMenor2000() {
		List<Fatura> novaLista = new ArrayList<>();
		
		for (Fatura fatura: listaFaturas) {
			if (fatura.getValor() >= 2000) {
				novaLista.add(fatura);
			}
		}
		
		this.listaFaturas = novaLista;
		
	}

	public Integer getNumeroFaturas() {
		return listaFaturas.size();
	}

}
