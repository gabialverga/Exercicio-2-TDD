package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class FuncionarioTestParticoesEquivalencia {
    @Test(expected = Exception.class)
    public void testCalculaSalarioDesenvolvedor_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", -1, new Desenvolvedor());
        float salario = funcionario.getSalarioLiquido();
    }

    @Test
    public void testCalculaSalarioDesenvolvedor_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 0, new Desenvolvedor());
        assertEquals(0, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDesenvolvedor_3() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 1, new Desenvolvedor());
        assertEquals(0.9, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDesenvolvedor_4() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2999.0, new Desenvolvedor());
        assertEquals(2399.20, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDesenvolvedor_5() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 3000.0, new Desenvolvedor());
        assertEquals(2400.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDesenvolvedor_6() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 4999.0, new Desenvolvedor());
        assertEquals(3999.20, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDesenvolvedor_7() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 5000.0, new Desenvolvedor());
        assertEquals(4000.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testCalculaSalarioDBA_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", -1, new DBA());
        float salario = funcionario.getSalarioLiquido();
    }

    @Test
    public void testCalculaSalarioDBA_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 0, new DBA());
        assertEquals(0, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDBA_3() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 1, new DBA());
        assertEquals(0.85, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDBA_4() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 1999.0, new DBA());
        assertEquals(1499.25, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDBA_5() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2000.0, new DBA());
        assertEquals(1500.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDBA_6() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2999.0, new DBA());
        assertEquals(2249.25, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioDBA_7() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 3000.0, new DBA());
        assertEquals(2250.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testCalculaSalarioTestador_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", -1, new Testador());
        float salario = funcionario.getSalarioLiquido();
    }

    @Test
    public void testCalculaSalarioTestador_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 0, new Testador());
        assertEquals(0, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioTestador_3() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 1, new Testador());
        assertEquals(0.85, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioTestador_4() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 1999.0, new Testador());
        assertEquals(1499.25, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioTestador_5() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2000.0, new Testador());
        assertEquals(1500.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioTestador_6() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 2999.0, new Testador());
        assertEquals(2249.25, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioTestador_7() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 3000.0, new Testador());
        assertEquals(2250.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testCalculaSalarioGerente_1() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", -1, new Gerente());
        float salario = funcionario.getSalarioLiquido();
    }

    @Test
    public void testCalculaSalarioGerente_2() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 0, new Gerente());
        assertEquals(0, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioGerente_3() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 1, new Gerente());
        assertEquals(0.8, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioGerente_4() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 4999.0, new Gerente());
        assertEquals(3999.20, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioGerente_5() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 5000.0, new Gerente());
        assertEquals(3500.00, funcionario.getSalarioLiquido(), 0.001);
    }

    @Test
    public void testCalculaSalarioGerente_6() {
        Funcionario funcionario = new Funcionario("Fulano", "fulano@gmail.com", 9999.0, new Gerente());
        assertEquals(6999.3, funcionario.getSalarioLiquido(), 0.001);
    }
}
