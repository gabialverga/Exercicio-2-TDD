package filtroFaturas;

import java.time.LocalDate;
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
		LocalDate umMesAtras = LocalDate.now().minusMonths(1);
		for (int i = 0; i < listaFaturas.size(); i++) {
			if (
					(listaFaturas.get(i).getValor() >= 2000 | listaFaturas.get(i).getValor() < 2500) 
					& listaFaturas.get(i).getDataFatura().getMonthValue() <= umMesAtras.getMonthValue()
				) {
				listaFaturas.remove(i);
			}
		}
	}

}
