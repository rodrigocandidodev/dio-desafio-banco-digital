package br.com.bancodigital.conta;

public interface IConta {
    void sacar(double valor, int senha4Dig);
	void depositar(double valor, int numeroConta);
	void transferir(Conta contaDestino, double valor);
	void imprimirInfoConta(int numeroAgencia, int numeroConta, int senha4Dig);
}
