package br.edu.uea.contacorrente;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.edu.uea.cliente.Cliente;
import br.edu.uea.transacao.Transacao;

public class ContaCorrente {
	private float saldo = 0.0f;
	private int numeroConta;
	private int numeroAgencia;
	private Cliente cliente;
	private ArrayList<Transacao>transacoes = new ArrayList<>();

	public ContaCorrente(int numeroConta, int numeroAgencia ) {
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		

	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void depositar(float v) {
		this.saldo += v;
		JOptionPane.showMessageDialog(null, "Deposito Efetuado com sucesso!");
		String t = "Deposito";
		registrarTransacao(t, v, "08:25");
	}

	public boolean sacar(float v) {
		if (this.saldo >= v) {
			this.saldo = this.saldo - v;
			JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!");
			String t = "Saque";
			registrarTransacao(t, v, "08:28");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
			return false;
		}
	}
	
	public String obterExtrato() {
		String retorno = "----- Seu Extrato -----\n";
		for (int i = 0; i < this.transacoes.size(); i++) {
			retorno += "Operação: " + this.transacoes.get(i).getOperacao() + "\n" + "Valor: "
					+ this.transacoes.get(i).getValor() + "\n" + "Data e Hora: " + this.transacoes.get(i).getDataHora() + "\n" + "-----------------------------" 
					+ "\n";
		}
		return retorno;
	}

	public void registrarTransacao(String operacao, float valor, String dataHora) {
		this.transacoes.add(new Transacao(operacao, valor, dataHora,null));
	}


	}
