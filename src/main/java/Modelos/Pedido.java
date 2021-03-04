package Modelos;

import java.util.Calendar;

public class Pedido {
	private int codigoPedido;
	private Calendar fechaPedido;
	private Calendar fechaEsperada;
	private Calendar fechaEntrega;
	private String estadoPedido;
	private String comentarios;
	private int codigo_cliente;

	public Pedido(int codigoPedido, Calendar fechaPedido, Calendar fechaEsperada, Calendar fechaEntrega,
			String estadoPedido, String comentarios, int codigo_cliente) {
		this.codigoPedido = codigoPedido;
		this.fechaPedido = fechaPedido;
		this.fechaEsperada = fechaEsperada;
		this.fechaEntrega = fechaEntrega;
		this.estadoPedido = estadoPedido;
		this.comentarios = comentarios;
		this.codigo_cliente = codigo_cliente;
	}

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Calendar getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Calendar fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Calendar getFechaEsperada() {
		return fechaEsperada;
	}

	public void setFechaEsperada(Calendar fechaEsperada) {
		this.fechaEsperada = fechaEsperada;
	}

	public Calendar getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Calendar fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public int getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", fechaPedido=" + fechaPedido + ", fechaEsperada="
				+ fechaEsperada + ", fechaEntrega=" + fechaEntrega + ", estadoPedido=" + estadoPedido + ", comentarios="
				+ comentarios + ", codigo_cliente=" + codigo_cliente + "]";
	}
}