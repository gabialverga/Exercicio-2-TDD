package testFiltroFaturas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    public void testgetListaFaturas() {
        assertEquals(listaFaturas, filtroFatura.getListaFaturas());
    }
}
