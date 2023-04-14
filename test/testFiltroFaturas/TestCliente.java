package testFiltroFaturas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import filtroFaturas.Cliente;

class TestCliente {
	
	private Cliente cliente;
	private LocalDate dataInclusao;

	@BeforeEach
    public void setUp() {
		dataInclusao = LocalDate.of(2021, 1, 1);
        cliente = new Cliente("João", dataInclusao, "SP");
	}

    @Test
    public void testCriaCliente() {
        assertNotNull(cliente);
    }
    
    @Test
    public void testGetNomeCliente() {
        assertEquals("João", cliente.getNome());
    }

    @Test
    public void testGetDataInclusaoCliente() {
        assertEquals(dataInclusao, cliente.getDataInclusao());
    }

    @Test
    public void testGetEstadoCliente() {
        assertEquals("SP", cliente.getEstado());
    }
    
    @Test
    public void testSetNomeCliente() {
    	cliente.setNome("Fábio");
        assertEquals("Fábio", cliente.getNome());
    }

    @Test
    public void testSetDataInclusaoCliente() {
    	LocalDate novaDataInclusao = LocalDate.of(2021, 1, 1);
    	cliente.setDataInclusao(novaDataInclusao);
        assertEquals(novaDataInclusao, cliente.getDataInclusao());
    }

    @Test
    public void testSetEstadoCliente() {
    	cliente.setEstado("PB");
        assertEquals("PB", cliente.getEstado());
    }

    
}
