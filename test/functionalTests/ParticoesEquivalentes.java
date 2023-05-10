package functionalTests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import filtroFaturas.Cliente;
import filtroFaturas.Fatura;
import filtroFaturas.Utils;

class ParticoesEquivalentes {

	@Test
    public void teste1() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "RS");
		
		LocalDate atual = LocalDate.now().minusDays(15);
		Fatura fatura = new Fatura("001", 0, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void teste2() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "RS");
		
		LocalDate atual = LocalDate.now().minusDays(15);
		Fatura fatura = new Fatura("001", 2000, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void teste3() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "RS");
		
		LocalDate atual = LocalDate.now().minusDays(15);
		Fatura fatura = new Fatura("001", 3000, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void teste4() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "RS");
		
		LocalDate atual = LocalDate.now().minusDays(15);
		Fatura fatura = new Fatura("001", 5000, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void teste5() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "RS");
		
		LocalDate atual = LocalDate.now().minusDays(15);
		Fatura fatura = new Fatura("001", 4000, atual, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void teste6() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "RS");
		
		LocalDate atual = LocalDate.now().plusMonths(2);
		Fatura fatura = new Fatura("001", 2000, atual, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void teste7() {
		LocalDate dataInclusao = LocalDate.now().plusMonths(3);
		Cliente cliente = new Cliente("João", dataInclusao, "RS");
		
		LocalDate atual = LocalDate.now().minusDays(15);
		Fatura fatura = new Fatura("001", 3000, atual, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void teste8() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "PB");
		
		LocalDate atual = LocalDate.now().minusDays(15);
		Fatura fatura = new Fatura("001", 4000, atual, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }

}
