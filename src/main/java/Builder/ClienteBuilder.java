package Builder;

import Excepciones.DatoNoValido;
import Excepciones.FormatoIncorrecto;
import Modelos.Cliente;
import Modelos.TipoDocumento;

public class ClienteBuilder {
	public static Cliente build(int codigoCliente, String nombreCliente, String contactoCliente, String apellidoCliente,
			String telefonoCliente, String faxCliente, String direccionCliente, String direccion2Cliente,
			String ciudadCliente, String regionCliente, String paisCliente, String codigoPostalCliente,
			int codigoEmpleadoRepVentas, double limiteCredito, TipoDocumento tipoDocumento, String DNI, String password)
			throws DatoNoValido, FormatoIncorrecto {

		Cliente clienteABuildear = new Cliente(codigoCliente, nombreCliente, contactoCliente, apellidoCliente,
				telefonoCliente, faxCliente, direccionCliente, direccion2Cliente, ciudadCliente, regionCliente,
				paisCliente, codigoPostalCliente, codigoEmpleadoRepVentas, limiteCredito, tipoDocumento, DNI, password);

		boolean testeo;

		if (clienteABuildear.getTipoDocumento() == TipoDocumento.tipoDocumentoDNI) {
			if (!clienteABuildear.getDocumento().matches("\\d{8}[A-Z]")) {
				testeo = false;
				throw new FormatoIncorrecto("El DNI deberian ser 8 digitos y una letra mayuscula");
			}
		} else {
			if (!clienteABuildear.getDocumento().matches("[A-Z]\\d{7}[A-Z]")) {
				testeo = false;
				throw new FormatoIncorrecto("El NIE deberia ser una letra mayuscula, 7 digitos y una letra mayuscula");
			}
		}
		if (!clienteABuildear.getEmail().matches("\\w+@\\w+[.][a-zA-Z]+")) {
			testeo = false;
			throw new FormatoIncorrecto("El email deberia contener [cadena]@[cadena].[cadena]");
		}
		return clienteABuildear;
	}
}