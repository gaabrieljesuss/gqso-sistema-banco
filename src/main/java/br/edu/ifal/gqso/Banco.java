package br.edu.ifal.gqso;

public class Banco {
    private double saldo;
    
    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }
    public class ValorNegativo extends Exception {
        private static final long serialVersionUID = 1L;
    }


    public double saldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo) throws ValorNegativo{
        if(saldo < 0){
            throw new ValorNegativo();
        }
        this.saldo = saldo;
    }

    public double saque(double valor) throws SaldoInsuficiente, ValorNegativo{
        if(valor > saldo()){
            throw new SaldoInsuficiente();
        }

        if(valor < 0){
            throw new ValorNegativo();
        }
        setSaldo(saldo() - valor);
        return saldo();
    }

    public double deposito(double valor) throws ValorNegativo{
        if(valor < 0 ){
            throw new ValorNegativo();
        }
        setSaldo(saldo() + valor);
        return saldo();
    }
}