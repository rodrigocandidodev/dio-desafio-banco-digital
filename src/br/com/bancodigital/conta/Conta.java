package br.com.bancodigital.conta;

import br.com.bancodigital.cliente.Cliente;

public class Conta implements IConta{
    protected int numeroAgencia;
	protected int numeroConta;
	protected double saldo;
    protected int senha4Dig;
    protected Cliente cliente;

    public Conta(int numeroAgencia, int numeroConta, Cliente cliente) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
        this.senha4Dig = 1234;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

    public int getSenha4Dig() {
        return senha4Dig;
    }

    public Cliente getCliente() {
        return cliente;
    }
	
	@Override
	public void sacar(double valor, int senha4Dig) {
        if(this.senha4Dig != senha4Dig) {
            System.out.println("Senha incorreta!");
        } else {
            if(this.saldo >= valor){
                this.saldo = this.saldo - valor;
                System.out.println("Saque realizado!");
            } else System.out.println("Saldo insuficiente");
        }
	}
		
	@Override
	public void depositar(double valor, int numeroConta) {
        this.saldo = saldo + valor;
        System.out.println("Depósito realizado!");
	}
	
	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor, this.senha4Dig);
		contaDestino.depositar(valor, this.numeroConta);
	}

    @Override
    public void imprimirInfoConta(int numeroAgencia, int numeroConta, int senha4Dig) {
        if(senha4Dig == this.senha4Dig) {
            System.out.println(String.format("Agencia: %d", this.numeroAgencia));
            System.out.println(String.format("Número: %d", this.numeroConta));
            System.out.println(String.format("Saldo: %.2f", this.saldo));
        } else {System.out.println("Senha incorreta!");}
    }
}
