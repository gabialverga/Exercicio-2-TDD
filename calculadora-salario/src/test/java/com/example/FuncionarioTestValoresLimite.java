package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class FuncionarioTestValoresLimite {

    @Test
    public void testCalculaSalarioDesenvolvedor_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 3000.01, new Desenvolvedor());
        assertEquals(2400.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDesenvolvedor_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 3000.0, new Desenvolvedor());
        assertEquals(2400.00, funcionario.getSalarioLiquido(), 0.001);
    }
    
    @Test
    public void testCalculaSalarioDesenvolvedor_3() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2999.99, new Desenvolvedor());
        assertEquals(2699.91, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDesenvolvedor_4() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 0.00, new Desenvolvedor());
        assertEquals(0.00, funcionario.getSalarioLiquido(), 0.00);
    }

    @Test(expected = Exception.class)
    public void testCalculaSalarioDesenvolvedor_5() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 0.00, new Desenvolvedor());
        float salario = funcionario.getSalarioLiquido();
    }

    @Test
    public void testCalculaSalarioDBA_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2000.01, new DBA());
        assertEquals(1500,01, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDBA_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2000.00, new DBA());
        assertEquals(1500.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDBA_3() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 1999.99, new DBA());
        assertEquals(1699.99, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDBA_4() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 0.00, new DBA());
        assertEquals(0.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testCalculaSalarioDBA_5() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", -1000.00, new DBA());
        float salario = funcionario.getSalarioLiquido();
    }

    @Test
    public void testCalculaSalarioTestador_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2000.01, new Testador());
        assertEquals(1500,01, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioTestador_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2000.00, new Testador());
        assertEquals(1500.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioTestador_3() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 1999.99, new Testador());
        assertEquals(1699.99, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioTestador_4() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 0.00, new Testador());
        assertEquals(0.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testCalculaSalarioTestador_5() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", -1000.00, new Testador());
        float salario = funcionario.getSalarioLiquido();
    }

    @Test
    public void testCalculaSalarioGerente_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 5000.01, new Gerente());
        assertEquals(3500.07, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioGerente_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 5000.00, new Gerente());
        assertEquals(3500.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioGerente_3() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 4999.99, new Gerente());
        assertEquals(3999.99, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioGerente_4() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 0.00, new Gerente());
        assertEquals(0.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testCalculaSalarioGerente_5() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", -1000.00, new Gerente());
        float salario = funcionario.getSalarioLiquido();
    }
}