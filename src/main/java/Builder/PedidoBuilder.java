package Builder;

import java.util.Calendar;

import Excepciones.WrongOrderDayCreationException;
import Modelos.Pedido;

public class PedidoBuilder {
	public static Pedido build(int codigoPedido, Calendar fechaPedido, Calendar fechaEsperada, Calendar fechaEntrega,
			String estadoPedido, String comentarios, int codigo_cliente) throws WrongOrderDayCreationException {

		Pedido pedidoABuildear = new Pedido(codigoPedido, fechaPedido, fechaEsperada, fechaEntrega, estadoPedido,
				comentarios, codigo_cliente);

		if (pedidoABuildear.getFechaPedido().get(Calendar.DAY_OF_MONTH) != Calendar.getInstance()
				.get(Calendar.DAY_OF_MONTH)) {
			throw new WrongOrderDayCreationException("");
		}

		Calendar testPedido = (Calendar) pedidoABuildear.getFechaPedido().clone();
		testPedido.add(Calendar.DAY_OF_MONTH, 3);

		if (pedidoABuildear.getFechaEntrega().before(testPedido)) {
			throw new WrongOrderDayCreationException("");
		}
		return pedidoABuildear;
	}
}