package JavaFX.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class altaClienteController implements Initializable{

	@FXML
	private Label lblNombre;

	@FXML
	private Label lblContacto;

	@FXML
	private Label lblApellido;

	@FXML
	private Label lblTelefono;

	@FXML
	private Label lblFax;

	@FXML
	private Label lblDireccion;

	@FXML
	private Label lblDireccion2;

	@FXML
	private Label lblCiudad;

	@FXML
	private Label lblRegion;

	@FXML
	private Label lblPais;

	@FXML
	private Label lblCodigoPostal;

	@FXML
	private Label lblRepVentas;

	@FXML
	private Label lblLimiteCredito;

	@FXML
	private Label lblTipoDocumento;

	@FXML
	private Label lblDocumento;

	@FXML
	private Label lblEmail;

	@FXML
	private Label lblClave;

	@FXML
	private TextField tecladoNombre;

	@FXML
	private TextField tecladoContacto;

	@FXML
	private TextField tecladoApellido;

	@FXML
	private TextField tecladoTelefono;

	@FXML
	private TextField tecladoFax;

	@FXML
	private TextField tecladoDireccion;

	@FXML
	private TextField tecladoDireccion2;

	@FXML
	private TextField tecladoCiudad;

	@FXML
	private TextField tecladoRegion;

	@FXML
	private TextField tecladoPais;

	@FXML
	private TextField tecladoCodigoPostal;

	@FXML
	private TextField tecladoRepVentas;

	@FXML
	private TextField tecladoLimiteCredito;

	@FXML
	private TextField tecladoDocumento;

	@FXML
	private TextField tecladoEmail;

	@FXML
	private TextField tecladoClave;

	@FXML
	private RadioButton radioButtonDNI;

	@FXML
	private RadioButton radioButtonNIE;

	@FXML
	private Button btnCrear;

	@FXML
	private Button btnReset;

	@FXML
	private Button btnCancelar;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ToggleGroup tg = new ToggleGroup();
		radioButtonDNI.setToggleGroup(tg);
		radioButtonNIE.setToggleGroup(tg);
	}

	public void crear(ActionEvent event) {

	}

	public void cancelar(ActionEvent event) {
		Platform.exit();
	}

	public void reset(ActionEvent event) {
		tecladoNombre.setText("");
		tecladoContacto.setText("");
		tecladoApellido.setText("");
		tecladoTelefono.setText("");
		tecladoFax.setText("");
		tecladoDireccion.setText("");
		tecladoDireccion2.setText("");
		tecladoCiudad.setText("");
		tecladoRegion.setText("");
		tecladoPais.setText("");
		tecladoCodigoPostal.setText("");
		tecladoRepVentas.setText("");
		tecladoLimiteCredito.setText("");
		if (radioButtonDNI.isSelected()) {
			radioButtonDNI.setSelected(false);
		} else if (radioButtonNIE.isSelected()) {
			radioButtonNIE.setSelected(false);
		}
		tecladoDocumento.setText("");
		tecladoEmail.setText("");
		tecladoClave.setText("");
	}
}