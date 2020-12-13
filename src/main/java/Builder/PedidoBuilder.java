package Builder;

import java.util.Calendar;

import Modelos.Pedido;

public class PedidoBuilder {
	public static Pedido build(int codigoPedido, Calendar fechaPedido, Calendar fechaEsperada, Calendar fechaEntrega,
			String estadoPedido, String comentarios, int codigo_cliente) {

		Pedido pedidoABuildear = new Pedido(codigoPedido, fechaPedido, fechaEsperada, fechaEntrega, estadoPedido, comentarios, codigo_cliente);

		boolean testeo;

		return pedidoABuildear;
	}
}