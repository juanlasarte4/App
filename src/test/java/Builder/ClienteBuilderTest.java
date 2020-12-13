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
			Cliente cliente = ClienteBuilder.build(0, "Juan", "Juan", null, null, null, null, null, null, null, null,
					null, 0, 0, TipoDocumento.tipoDocumentoDNI, "64665472J", "juanlasartefp@gmail.com", null);
		} catch (FormatoIncorrecto e) {
			fail();
		}
		assertTrue(true);
	}

	@Test
	public void testNIE() {
		try {
			Cliente cliente = ClienteBuilder.build(0, "Juan", "Juan", null, null, null, null, null, null, null, null,
					null, 0, 0, TipoDocumento.tipoDocumentoNIE, "N6465472J", "juanlasartefp@gmail.com", null);
		} catch (FormatoIncorrecto e) {
			fail();
		}
		assertTrue(true);
	}
}