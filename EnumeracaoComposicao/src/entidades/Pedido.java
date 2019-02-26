package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusDoPedido;

public class Pedido {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private StatusDoPedido status;
	private Date momento;
	private Cliente cliente;
	private List<ItensPedido> itens = new ArrayList<>();

	public Pedido(StatusDoPedido status, Date momento, Cliente cliente) {
		this.status = status;
		this.momento = momento;
		this.cliente = cliente;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItensPedido> getItens() {
		return itens;
	}

	public void addItens(ItensPedido itens) {
		this.itens.add(itens);

	}

	public void removeItens(ItensPedido itens) {
		this.itens.remove(itens);

	}

	public Double total() {
		double soma = 0;
		for (ItensPedido x : itens) {
			soma += x.subTotal();
		}
		return soma;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Resumo do Pedido:\n");
		sb.append("Momento do pedido: " + sdf.format(momento) + "\n");
		sb.append("Status do pedido: " + status + "\n");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido:\n");

		for (ItensPedido x : itens) {
			sb.append(x.toString() + "\n");
		}

		sb.append("Valor toal: " + total());

		return sb.toString();
	}

}
