package br.edu.ifal.gqso;

public class Banco {
    private double saldo;
    
    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }


    public double saldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double saque(double valor) {
        
        setSaldo(saldo() - valor);
        return saldo();
    }
}