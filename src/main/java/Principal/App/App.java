package Principal.App;

import Modelos.Cliente;
import Modelos.Pedido;

public class App {
	public static void main(String[] args) {
		Cliente builder = new Cliente(1, "Juan", "Juan", "Lasarte", "654 56 34 78", null, null, null, "Zaragoza",
				"Aragón", "Espana", "50002", 1, 0);

		Pedido builderPedido = new Pedido(1, null, null, null, "En espera", null, 1);
		System.out.println(builder);
		System.out.println(builderPedido);
	}
}