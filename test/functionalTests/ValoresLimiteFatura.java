package functionalTests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import filtroFaturas.Cliente;
import filtroFaturas.Fatura;
import filtroFaturas.Utils;

class ValoresLimiteFatura {
	
	@Test
    public void testValorFatura1() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate dataFatura = LocalDate.now();
		Fatura fatura = new Fatura("001", 1999, dataFatura, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testValorFatura2() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate dataFatura = LocalDate.now();
		Fatura fatura = new Fatura("001", 1998, dataFatura, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testValorFatura3() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate dataFatura = LocalDate.now();
		Fatura fatura = new Fatura("001", 0, dataFatura, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testValorFatura4() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate dataFatura = LocalDate.now();
		Fatura fatura = new Fatura("001", 1, dataFatura, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura1() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate umMes = LocalDate.now().minusMonths(1);
		Fatura fatura = new Fatura("001", 2000, umMes, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura2() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate umMes = LocalDate.now().minusMonths(1);
		Fatura fatura = new Fatura("001", 2001, umMes, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura3() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate umMes = LocalDate.now().minusMonths(1);
		Fatura fatura = new Fatura("001", 2500, umMes, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura4() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate umMes = LocalDate.now().minusMonths(1);
		Fatura fatura = new Fatura("001", 2499, umMes, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura5() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate menosDeMes = LocalDate.now().minusDays(30);
		Fatura fatura = new Fatura("001", 2000, menosDeMes, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura6() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate menosDeMes = LocalDate.now().minusDays(30);
		Fatura fatura = new Fatura("001", 2001, menosDeMes, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura7() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate menosDeMes = LocalDate.now().minusDays(30);
		Fatura fatura = new Fatura("001", 2500, menosDeMes, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura8() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate menosDeMes = LocalDate.now().minusDays(30);
		Fatura fatura = new Fatura("001", 2499, menosDeMes, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura9() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate zeroDias = LocalDate.now();
		Fatura fatura = new Fatura("001", 2000, zeroDias, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura10() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate zeroDias = LocalDate.now();
		Fatura fatura = new Fatura("001", 2001, zeroDias, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura11() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate zeroDias = LocalDate.now();
		Fatura fatura = new Fatura("001", 2500, zeroDias, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura12() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate zeroDias = LocalDate.now();
		Fatura fatura = new Fatura("001", 2499, zeroDias, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura13() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate umDia = LocalDate.now().minusDays(1);
		Fatura fatura = new Fatura("001", 2000, umDia, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura14() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate umDia = LocalDate.now().minusDays(1);
		Fatura fatura = new Fatura("001", 2001, umDia, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura15() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate umDia = LocalDate.now().minusDays(1);
		Fatura fatura = new Fatura("001", 2500, umDia, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura16() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate umDia = LocalDate.now().minusDays(1);
		Fatura fatura = new Fatura("001", 2499, umDia, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura17() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate maisDeUmMes = LocalDate.now().plusMonths(2);
		Fatura fatura = new Fatura("001", 2000, maisDeUmMes, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura18() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate maisDeUmMes = LocalDate.now().plusMonths(2);
		Fatura fatura = new Fatura("001", 2001, maisDeUmMes, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataFatura19() {
		LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate maisDeUmMes = LocalDate.now().plusMonths(2);
		Fatura fatura = new Fatura("001", 2499, maisDeUmMes, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente1() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(2);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2500, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente2() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(2);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2501, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente3() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(2);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2999, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente4() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(2);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 3000, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente5() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2500, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente6() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2501, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente7() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2999, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente8() {
		LocalDate dataInclusao = LocalDate.now().minusMonths(1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 3000, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente9() {
		LocalDate dataInclusao = LocalDate.now();
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2500, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente10() {
		LocalDate dataInclusao = LocalDate.now();
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2501, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente11() {
		LocalDate dataInclusao = LocalDate.now();
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2999, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente12() {
		LocalDate dataInclusao = LocalDate.now();
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 3000, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente13() {
		LocalDate dataInclusao = LocalDate.now().minusDays(1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2500, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente14() {
		LocalDate dataInclusao = LocalDate.now().minusDays(1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2501, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente15() {
		LocalDate dataInclusao = LocalDate.now().minusDays(1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 2999, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataCliente16() {
		LocalDate dataInclusao = LocalDate.now().minusDays(1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 3000, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testValorInvalido1() {
		LocalDate dataInclusao = LocalDate.now().minusDays(1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 3001, atual, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testValorInvalido2() {
		LocalDate dataInclusao = LocalDate.now().minusDays(1);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now();
		Fatura fatura = new Fatura("001", 3999, atual, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testDataClienteFaturaInvalido1() {
		LocalDate dataInclusao = LocalDate.now().plusMonths(3);
		Cliente cliente = new Cliente("João", dataInclusao, "SP");
		
		LocalDate atual = LocalDate.now().plusMonths(2);
		Fatura fatura = new Fatura("001", 2500, atual, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testeEstado1() {
		LocalDate dataInclusao = LocalDate.now().plusMonths(3);
		Cliente cliente = new Cliente("João", dataInclusao, "SC");
		
		LocalDate atual = LocalDate.now().plusMonths(2);
		Fatura fatura = new Fatura("001", 4001, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testeEstado2() {
		LocalDate dataInclusao = LocalDate.now().plusMonths(3);
		Cliente cliente = new Cliente("João", dataInclusao, "SC");
		
		LocalDate atual = LocalDate.now().plusMonths(2);
		Fatura fatura = new Fatura("001", 4002, atual, cliente);
		
		assertEquals(true, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testeEstadoInvalido1() {
		LocalDate dataInclusao = LocalDate.now().plusMonths(3);
		Cliente cliente = new Cliente("João", dataInclusao, "SC");
		
		LocalDate atual = LocalDate.now().plusMonths(2);
		Fatura fatura = new Fatura("001", 4000, atual, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testeEstadoInvalido2() {
		LocalDate dataInclusao = LocalDate.now().plusMonths(3);
		Cliente cliente = new Cliente("João", dataInclusao, "PB");
		
		LocalDate atual = LocalDate.now().plusMonths(2);
		Fatura fatura = new Fatura("001", 4001, atual, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	@Test
    public void testeEstadoInvalido3() {
		LocalDate dataInclusao = LocalDate.now().plusMonths(3);
		Cliente cliente = new Cliente("João", dataInclusao, "PB");
		
		LocalDate atual = LocalDate.now().plusMonths(2);
		Fatura fatura = new Fatura("001", 4002, atual, cliente);
		
		assertEquals(false, Utils.needsFiltro(fatura));
    }
	
	
}
