package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ifal.gqso.Banco.SaldoInsuficiente;

public class BancoTest {
    private Banco banco;


    @BeforeEach
    public void setUp(){
        this.banco = new Banco();
        banco.setSaldo(200);
    }

    @Test
    public void saldoTest(){
        assertEquals(200, banco.saldo());
    }

    @Test
    public void saqueTest() throws SaldoInsuficiente {
        assertEquals(150, banco.saque(50));
        assertEquals(-50, banco.saque(250));
    }
}
