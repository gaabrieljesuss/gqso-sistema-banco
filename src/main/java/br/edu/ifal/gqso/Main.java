package br.edu.ifal.gqso;

import java.util.Scanner;

import br.edu.ifal.gqso.Banco.SaldoInsuficiente;
import br.edu.ifal.gqso.Banco.ValorNegativo;;

public class Main {
    public static void main(String args[]) throws SaldoInsuficiente, ValorNegativo{

        Banco banco = new Banco();
        int opcaoEscolha;
        double valor;
        Scanner teclado = new Scanner(System.in);

        for(;;){

            System.out.println("0 - Sair\n1 - Saldo\n2 - Saque\n3 - deposito\n");
            
            System.out.println("Escolha a sua opcao: \n");

            opcaoEscolha = teclado.nextInt();

            if(opcaoEscolha==0){
                break;
            }
            else if(opcaoEscolha==1){
                System.out.println("Saldo atual: $"+banco.saldo()+"\n");
                
            }else if(opcaoEscolha==2){
                System.out.println("Digite o valor que deseja sacar: \n");
                valor = teclado.nextDouble();
                banco.saque(valor);
                
            }else if(opcaoEscolha==3){
                System.out.println("Digite o valor que deseja depositar: \n");
                valor = teclado.nextDouble();
                banco.deposito(valor);
                
            }else{
                System.out.println("Digite uma opcao valida!\n");
            }
            
        }

    }
}
