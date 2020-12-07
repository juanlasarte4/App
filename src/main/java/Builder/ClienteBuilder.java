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

		boolean datos_necesarios_asignados = true;
		datos_necesarios_asignados &= (clienteABuildear.getCodigoCliente() != 0) && (clienteABuildear.getNombreCliente() != null)
				&& (clienteABuildear.getTelefonoCliente() != null) && (clienteABuildear.getFaxCliente() != null)
				&& (clienteABuildear.getDireccionCliente() != null) && (clienteABuildear.getCiudadCliente() != null);

		if (!datos_necesarios_asignados) {
			throw new DatoNoValido("Ninguno de los siguientes campos puede tener "
					+ "su valor por defecto: codigo, nombre, telefono, " + "fax, direccion1, ciudad.");
		}

		boolean email_bien = true;
		if (clienteABuildear.email != null && clienteABuildear.email.isPresent()) {
			if (clienteABuildear.contrasena == null || !clienteABuildear.contrasena.isPresent()) {
				email_bien = false;
				throw new DatoNoValido("Deberia haber contraseña!!!");
			}
			// Comprobar que el email es en forma tal @ tal . tal
			if (!clienteABuildear.email.get().matches("\\w+@\\w+[.][a-zA-Z]+")) {
				email_bien = false;
				throw new FormatoIncorrecto("El email debería cumplir \"[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z]+\", "
						+ "pero es " + clienteABuildear.email.get());
			}
		}

		boolean documento_bien = true;
		if (clienteABuildear.tipo_doc != null && clienteABuildear.tipo_doc.isPresent()) {
			if (clienteABuildear.dni == null || !clienteABuildear.dni.isPresent()) {
				documento_bien = false;
				throw new DatoNoValido("Debería haber documento!!!");
			} else {
				switch (clienteABuildear.tipo_doc.get()) {
				case DNI: // Comprobar que el documento es 8 dígitos + letra
					if (!clienteABuildear.dni.get().matches("\\d{8}[a-zA-Z]")) {
						documento_bien = false;
						throw new FormatoIncorrecto("El formato DNI debería cumplir \"[0-9]{8}[a-zA-Z]\", " + "pero es "
								+ clienteABuildear.dni.get());
					}
					break;
				case NIE: // Comprobar que el documento es letra + 7 dígitos + letra
					if (!clienteABuildear.dni.get().matches("[a-zA-Z]\\d{7}[a-zA-Z]")) {
						documento_bien = false;
						throw new FormatoIncorrecto("El formato NIE debería cumplir \"[a-zA-Z][0-9]{7}[a-zA-Z]\", "
								+ "pero es " + clienteABuildear.dni.get());
					}
					break;
				}
			}
		}
		return datos_necesarios_asignados && email_bien && documento_bien ? clienteABuildear : null;
	}
}