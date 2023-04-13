package testFiltroFaturas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import filtroFaturas.Cliente;
import filtroFaturas.Fatura;
import filtroFaturas.FiltroFatura;

class TestFiltroFatura {

	private List listaFaturas;
	private FiltroFatura filtroFatura;

	@BeforeEach
    public void setUp() {
		listaFaturas = new ArrayList<>();
		filtroFatura = new FiltroFatura(listaFaturas);
	}

	@Test
    public void testCriaFatura() {
        assertNotNull(filtroFatura);
    }
	
	@Test
    public void testGetListaFaturas() {
        assertEquals(listaFaturas, filtroFatura.getListaFaturas());
    }
	
	@Test
    public void testSetListaFaturas() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
        Cliente cliente = new Cliente("João", dataInclusao, "SP");
        
		LocalDate dataFatura = LocalDate.now();
        Fatura fatura = new Fatura("001", 100.0, dataFatura, cliente);
        
        filtroFatura.setFaturas(fatura);
        listaFaturas.add(fatura);
        
        assertEquals(listaFaturas, filtroFatura.getListaFaturas());
    }
}
