package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class FuncionarioTest {

    @Test
    public void deveCalcularSalarioLiquidoDesenvolvedorComSalarioMaiorIgual3000() {
        Funcionario desenvolvedor = new Funcionario("Fulano", "fulano@teste.com", 4000, new Desenvolvedor());
        assertEquals(3200, desenvolvedor.getSalarioLiquido(), 0.001);
    }

    @Test
    public void deveCalcularSalarioLiquidoDesenvolvedorComSalarioMenor3000() {
        Funcionario desenvolvedor = new Funcionario("Fulano", "fulano@teste.com", 2500, new Desenvolvedor());
        assertEquals(2250, desenvolvedor.getSalarioLiquido(), 0.001);
    }

    @Test
    public void deveCalcularSalarioLiquidoDBAComSalarioMaiorIgual2000() {
        Funcionario dba = new Funcionario("Fulano", "fulano@teste.com", 2500, new DBA());
        assertEquals(1875, dba.getSalarioLiquido(), 0.001);
    }

    @Test
    public void deveCalcularSalarioLiquidoDBAComSalarioMenor2000() {
        Funcionario dba = new Funcionario("Fulano", "fulano@teste.com", 1500, new DBA());
        assertEquals(1275, dba.getSalarioLiquido(), 0.001);
    }

    @Test
    public void deveCalcularSalarioLiquidoTestadorComSalarioMaiorIgual2000() {
        Funcionario testador = new Funcionario("Fulano", "fulano@teste.com", 2500, new Testador());
        assertEquals(1875, testador.getSalarioLiquido(), 0.001);
    }

    @Test
    public void deveCalcularSalarioLiquidoTestadorComSalarioMenor2000() {
        Funcionario testador = new Funcionario("Fulano", "fulano@teste.com", 1500, new Testador());
        assertEquals(1275, testador.getSalarioLiquido(), 0.001);
    }

    @Test
    public void deveCalcularSalarioLiquidoGerenteComSalarioMaiorIgual5000() {
        Funcionario gerente = new Funcionario("Fulano", "fulano@teste.com", 6000, new Gerente());
        assertEquals(4200, gerente.getSalarioLiquido(), 0.001);
    }

    @Test
    public void deveCalcularSalarioLiquidoGerenteComSalarioMenor5000() {
        Funcionario gerente = new Funcionario("Fulano", "fulano@teste.com", 4000, new Gerente());
        assertEquals(3200, gerente.getSalarioLiquido(), 0.001);
    }
}
