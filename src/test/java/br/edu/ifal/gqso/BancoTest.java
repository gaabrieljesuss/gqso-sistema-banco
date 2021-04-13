package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    public void saqueTest(){
        
    }
}
