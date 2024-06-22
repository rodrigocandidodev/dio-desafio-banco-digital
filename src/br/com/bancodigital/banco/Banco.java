package br.com.bancodigital.banco;

import br.com.bancodigital.agencia.Agencia;

public class Banco{

    private String nome;

    public Banco(String nome) {
        this.nome = nome;
    }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

    public void criarAgencia(int numeroAgencia){
        Agencia agencia = new Agencia();
        agencia.setNumero(numeroAgencia);
    }
}