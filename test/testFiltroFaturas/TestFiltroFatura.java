package testFiltroFaturas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import filtroFaturas.FiltroFatura;

class TestFiltroFatura {

	@Test
    public void testCriaFatura() {
		List listaFaturas = new ArrayList<>();
		FiltroFatura filtroFatura = new FiltroFatura(listaFaturas);
        assertNotNull(filtroFatura);
    }

}
