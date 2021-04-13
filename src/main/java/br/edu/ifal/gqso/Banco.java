package br.edu.ifal.gqso;

public class Banco {
    private double saldo;
    
    public double saldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double saque(double valor){
        setSaldo(saldo() - valor);
        return 0;
    }
}