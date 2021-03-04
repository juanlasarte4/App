package Builder;

import java.util.Calendar;

import Excepciones.ClienteNotFoundException;
import Excepciones.WrongOrderDayCreationException;
import Modelos.Pedido;

public class PedidoBuilder {
	public static Pedido build(int codigoPedido, Calendar fechaPedido, Calendar fechaEsperada, Calendar fechaEntrega,
			String estadoPedido, String comentarios, int codigo_cliente) throws WrongOrderDayCreationException, ClienteNotFoundException {

		Pedido pedidoABuildear = new Pedido(codigoPedido, fechaPedido, fechaEsperada, fechaEntrega, estadoPedido,
				comentarios, codigo_cliente);

		if (pedidoABuildear.getFechaPedido().get(Calendar.DAY_OF_MONTH) != Calendar.getInstance()
				.get(Calendar.DAY_OF_MONTH)) {
			throw new WrongOrderDayCreationException("La fecha de creacion tiene que ser el dia de hoy");
		}

		Calendar testPedido = (Calendar) pedidoABuildear.getFechaPedido().clone();
		testPedido.add(Calendar.DAY_OF_MONTH, 3);

		if (pedidoABuildear.getFechaEntrega().before(testPedido)) {
			throw new WrongOrderDayCreationException(
					"La fecha de entrega esperada no puede ser anterior a tres días después de la fecha de creación");
		}
		
		if (pedidoABuildear.getCodigo_cliente() == 0) {
			throw new ClienteNotFoundException("El codigo de cliente no existe");
		}

		return pedidoABuildear;
	}
}