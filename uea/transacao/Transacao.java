package br.edu.uea.transacao;

import br.edu.uea.contacorrente.ContaCorrente;

public class Transacao {
	private String operacao;
	private float valor;
	private String dataHora;
	private ContaCorrente contaCorrente;
	
	public Transacao(String operacao, float valor, String dataHora, ContaCorrente contaCorrente) {
		this.operacao = operacao;
		this.valor = valor;
		this.dataHora = dataHora;
		this.contaCorrente = contaCorrente;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
}
