package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class FuncionarioTestTabelaDecisao {
    
    @Test
    public void testCalculaSalarioDesenvolvedor_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 3000.01, new Desenvolvedor());
        assertEquals(2400.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDesenvolvedor_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2999.99, new Desenvolvedor());
        assertEquals(2699.91, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDBA_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2000.01, new DBA());
        assertEquals(1500,01, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDBA_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 1999.99, new DBA());
        assertEquals(1699.99, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioTestador_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2000.01, new Testador());
        assertEquals(1500,01, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioTestador_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 1999.99, new Testador());
        assertEquals(1699.99, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioGerente_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 5000.01, new Gerente());
        assertEquals(3500.07, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioGerente_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 4999.99, new Gerente());
        assertEquals(3999.99, funcionario.getSalarioLiquido(), 0.001);
    }
}
