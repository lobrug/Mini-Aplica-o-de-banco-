package appBanco.sources;


import appBanco.sources.obj.ContaBancaria;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria("Lorenzo", 266958221);

        //Operacoes de saque e deposito
        conta01.deposito(100);
        conta01.sacar(120);

        //Informacoes do usuario
        conta01.exibirInformacoes();

        System.out.println("---------------------");

        ContaBancaria conta02 = new ContaBancaria("Pedro", 666);

        conta02.deposito(-100);
        conta02.sacar(120);

        conta02.exibirInformacoes();

    }
}