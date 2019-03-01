package model.entities;

import model.exceptions.DomainExceptions;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public double getSaldo() {
		return saldo;
	}

	public void Deposito(double valor) {

		saldo += valor;

	}

	public void Saque(double valor) throws DomainExceptions {

		if (valor > saldo) {
			throw new DomainExceptions("Saldo insuficiente");
		}

		if (valor > limiteSaque) {
			throw new DomainExceptions("A quantia excede o limite de saque");
		}

		saldo -= valor;

	}

}
