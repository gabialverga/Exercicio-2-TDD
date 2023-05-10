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
	private Fatura fatura1;
	private LocalDate dataInclusao;
	private Cliente cliente1;
	private LocalDate dataFatura;

	@BeforeEach
    public void setUp() {
		listaFaturas = new ArrayList<>();
		filtroFatura = new FiltroFatura(listaFaturas);
		
		dataInclusao = LocalDate.of(2021, 1, 1);
		cliente1 = new Cliente("João", dataInclusao, "SP");
        
		dataFatura = LocalDate.now();
        fatura1 = new Fatura("001", 100.0, dataFatura, cliente1);
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
        filtroFatura.setFaturas(fatura1);
        listaFaturas.add(fatura1);
        
        assertEquals(listaFaturas, filtroFatura.getListaFaturas());
    }
	
	@Test
    public void testGetNumeroFaturas() {
		 filtroFatura.setFaturas(fatura1);
		 assertEquals(1, filtroFatura.getNumeroFaturas());
	}
	
    @Test
    public void testRemoverFaturasMenor2000() {
    	filtroFatura.setFaturas(fatura1);

        Fatura fatura2 = new Fatura("002", 2500.0, LocalDate.now(), cliente1);
        filtroFatura.setFaturas(fatura2);
        
        assertEquals(2, filtroFatura.getNumeroFaturas());
        filtroFatura.removerFaturasMenor2000();
        assertEquals(1, filtroFatura.getNumeroFaturas());
    }
    
    @Test
    public void testRemoverFaturas2000e2500UmMes() {
    	filtroFatura.setFaturas(fatura1);

    	LocalDate dataMesAtras = LocalDate.now().minusMonths(1);
        Fatura fatura2 = new Fatura("002", 2500.0, dataMesAtras, cliente1);
        filtroFatura.setFaturas(fatura2);
        
        assertEquals(2, filtroFatura.getNumeroFaturas());
        filtroFatura.removerFaturas2000e2500UmMes();
        assertEquals(1, filtroFatura.getNumeroFaturas());
    }
    
    @Test
    public void testRemoverFaturas2500e300ClienteDoisMeses() {
    	filtroFatura.setFaturas(fatura1);

    	LocalDate dataDoisMesAtras = LocalDate.now().minusMonths(2);
    	Cliente cliente2 = new Cliente("Pedro", dataDoisMesAtras, "RJ");
        Fatura fatura2 = new Fatura("002", 2500, LocalDate.now(), cliente2);
        filtroFatura.setFaturas(fatura2);
        
        assertEquals(2, filtroFatura.getNumeroFaturas());
        filtroFatura.removerFaturas2500e3000ClienteDoisMeses();
        assertEquals(1, filtroFatura.getNumeroFaturas());
    }
    
    @Test
    public void testRemoverFaturas4000ClienteSul() {
    	filtroFatura.setFaturas(fatura1);

    	Cliente cliente2 = new Cliente("Kleber", LocalDate.now(), "RS");
        Fatura fatura2 = new Fatura("002", 5000, LocalDate.now(), cliente2);
        filtroFatura.setFaturas(fatura2);
        
        assertEquals(2, filtroFatura.getNumeroFaturas());
        filtroFatura.removerFaturas4000ClienteSul();
        assertEquals(1, filtroFatura.getNumeroFaturas());
    }
}
