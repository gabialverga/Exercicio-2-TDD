package filtroFaturas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utils {
	
	public static boolean needsFiltro(Fatura fatura) {
		LocalDate atual = LocalDate.now();
		
		List estadosSul = new ArrayList<String>();
		estadosSul.add("SC");
		estadosSul.add("RS");
		estadosSul.add("PR");
		
		if (fatura.getValor() < 2000) {
			return true;
		} else if (fatura.getValor() >= 2000 & fatura.getValor() <= 2500 & fatura.getDataFatura().getMonthValue() <= atual.getMonthValue()) {
			return true;
		} else if (fatura.getValor() >= 2500 & fatura.getValor() <= 3000 & fatura.getCliente().getDataInclusao().getMonthValue() <= atual.getMonthValue()) {
			return true;
		} else if (fatura.getValor() > 4000 & estadosSul.contains(fatura.getCliente().getEstado())) {
			return true;
		}
		return false;
 	}

}
