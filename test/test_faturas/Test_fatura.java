package test_faturas;

import org.junit.jupiter.api.Test;

import filtro_faturas.Fatura;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class Test_fatura {

	private Fatura fatura;
	
	@Test
    public void testCriaFatura() {
		LocalDate dataFatura = LocalDate.now();
		fatura = new Fatura("001", 100.0, dataFatura);
		
        assertNotNull(fatura);
    }

}
