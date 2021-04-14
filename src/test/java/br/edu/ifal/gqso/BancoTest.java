package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ifal.gqso.Banco.SaldoInsuficiente;
import br.edu.ifal.gqso.Banco.ValorNegativo;

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
    public void saqueTest() throws SaldoInsuficiente, ValorNegativo{
        assertEquals(150, banco.saque(50));
        assertThrows(Banco.SaldoInsuficiente.class, () -> banco.saque(250));
        assertThrows(Banco.ValorNegativo.class, () -> banco.saque(-50));
    }

    @Test
    public void depositoTest() throws ValorNegativo{
        assertEquals(300, banco.deposito(100));
        assertEquals(100, banco.deposito(-100));
    }

}
