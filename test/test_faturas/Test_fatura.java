package test_faturas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import filtro_faturas.Fatura;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class Test_fatura {

	private Fatura fatura;
	
	@BeforeEach
    public void setUp() {
        LocalDate dataFatura = LocalDate.now();
        fatura = new Fatura("001", 100.0, dataFatura);
    }
	
	@Test
    public void testCriaFatura() {
        assertNotNull(fatura);
    }
	
	@Test
    public void testGetCodigoFatura() {
        assertEquals("001", fatura.getCodigo());
    }
	
	@Test
    public void testGetValorFatura() {
        assertEquals(100.0, fatura.getValor(), 0.001);
    }

    @Test
    public void testGetDataFatura() {
        LocalDate dataFatura = LocalDate.now();
        assertEquals(dataFatura, fatura.getDataFatura());
    }
    
    @Test
    public void testSetCodigoFatura() {
    	fatura.setCodigo("002");
        assertEquals("002", fatura.getCodigo());
    }
	
	@Test
    public void testSetValorFatura() {
		fatura.setValor(101);
        assertEquals(101, fatura.getValor(), 0.001);
    }

    @Test
    public void testSetDataFatura() {
        LocalDate novaDataFatura = LocalDate.of(1990, 5, 20);
        fatura.setDataFatura(novaDataFatura);
        assertEquals(novaDataFatura, fatura.getDataFatura());
    }

}
