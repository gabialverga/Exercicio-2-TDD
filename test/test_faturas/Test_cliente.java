package test_faturas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import filtro_faturas.Cliente;

class Test_cliente {

    @Test
    public void testCriaCliente() {
    	LocalDate dataInclusao = LocalDate.of(2021, 1, 1);
        Cliente cliente = new Cliente("João", dataInclusao, "SP");
        assertNotNull(cliente);
    }

}
