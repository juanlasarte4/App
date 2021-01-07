package Builder;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import Excepciones.FormatoIncorrecto;
import Modelos.Cliente;
import Modelos.TipoDocumento;

public class ClienteBuilderTest {

	@Test
	public void testCliente() {
		try {
			Cliente cliente = ClienteBuilder.build(39, "Pepe", "Pepe", "Garcia", "601674326", "03123679",
					"Av/Navarra, 6", "C/Via Hispanidad, 12", "Zaragoza", "Aragon", "Spain", "50001", 8, 5000.0,
					TipoDocumento.tipoDocumentoDNI, "64665472J", "pepegarcia@gmail.com", "claveInventada");
		} catch (FormatoIncorrecto e) {
			fail();
		}
		assertTrue(true);
	}

	@Test
	public void testNIE() {
		try {
			Cliente cliente = ClienteBuilder.build(40, "Ivan", "Ivan", "Murillo", "644673982", "53478654",
					"C/Rio Ebro, 5", null, "Zaragoza", "Aragon", "Spain", "50502", 5, 3000.0,
					TipoDocumento.tipoDocumentoNIE, "N6465472J", "ivanmurillo@gmail.com", "otraClaveInventada");
		} catch (FormatoIncorrecto e) {
			fail();
		}
		assertTrue(true);
	}
}