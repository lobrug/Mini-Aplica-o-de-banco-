package appBanco.sources.obj;

public class ContaBancaria {
    private String nome;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void deposito(double valor) {
        if(valor > 0){
        this.saldo += valor;
            System.out.println("Valor depositado com sucesso!");
        }else{
            System.out.println("Valor Invalido!");
        }
    }

    public void sacar(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
}


