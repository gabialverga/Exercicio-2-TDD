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
	
	public Integer getNumeroFaturas() {
		return listaFaturas.size();
	}

	public void removerFaturasMenor2000() {	
		for (int i = 0; i < listaFaturas.size(); i++) {
			if (listaFaturas.get(i).getValor() < 2000) {
				listaFaturas.remove(i);
			}
		}
		
	}

	public void removerFaturas2000e2500UmMes() {
		List<Fatura> novaLista = new ArrayList<>();
		
		for (Fatura fatura: listaFaturas) {
			if (fatura.getValor() >= 2000 | fatura.getValor() < 2000) {
				novaLista.add(fatura);
			}
		}
		
		this.listaFaturas = novaLista;
		
	}

}
