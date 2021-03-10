package JavaFX.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class loginController implements Initializable {

	@FXML
	Label lblUsuario;

	@FXML
	Label lblClave;

	@FXML
	TextField tecladoUsuario;

	@FXML
	TextField tecladoClaveVista;

	@FXML
	PasswordField tecladoClaveOculta;

	@FXML
	Button btnOcultarClave;

	@FXML
	Button btnVerClave;

	@FXML
	TextArea taOlvidoClave;

	@FXML
	Button btnAcceder;

	@FXML
	Button btnSalir;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		URL linkVerClave = getClass().getResource("/img/view_eye_icon_invisible.png");
		URL linkOcultarClave = getClass().getResource("/img/view_eye_icon.png");

		Image imagenVerClave = new Image(linkVerClave.toString(), 0, 0, false, true);
		Image imagenOcultarClave = new Image(linkOcultarClave.toString(), 0, 0, false, true);

		btnVerClave.setGraphic(new ImageView(imagenVerClave));
		btnOcultarClave.setGraphic(new ImageView(imagenOcultarClave));
	}

	public void ocultarClave() {
		btnOcultarClave.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// CAMBIAR LOS CAMPOS DE TEXTOS
				tecladoClaveOculta.setVisible(true);
				tecladoClaveVista.setVisible(false);

				// TRANSLADAR CONTENIDO DE UN CAMPO A OTRO
				tecladoClaveOculta.setText(tecladoClaveVista.getText());

				// CAMBIAR LOS BOTONES
				btnOcultarClave.setVisible(false);
				btnVerClave.setVisible(true);
			}
		});
	}

	public void verClave() {
		btnVerClave.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// CAMBIAR LOS CAMPOS DE TEXTOS
				tecladoClaveOculta.setVisible(false);
				tecladoClaveVista.setVisible(true);

				// TRANSLADAR CONTENIDO DE UN CAMPO A OTRO
				tecladoClaveVista.setText(tecladoClaveOculta.getText());

				// CAMBIAR LOS BOTONES
				btnVerClave.setVisible(false);
				btnOcultarClave.setVisible(true);
			}
		});
	}

	public void olvidoClave() {
		taOlvidoClave.setOnMouseClicked(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Mensaje de información");
				alert.setHeaderText(null);
				alert.setContentText("Por el momento, no hay un sistema para recuperar claves.");
				alert.show();
			}
		});
	}

	public void acceder() {
		String usuario = tecladoUsuario.getText();
		String clave = tecladoClaveVista.getText();
		if (usuario.equals("admin") && clave.equals("4DM1n4DM1n")) {
			try {
				Stage secondStage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/JavaFX/vista/principal.fxml"));

				// CARGO LA ESCENA
				Scene scene = new Scene(root);

				// ACTUALIZO LA ESCENA Y LA MUESTRO
				secondStage.initModality(Modality.APPLICATION_MODAL);
				secondStage.setTitle("Principal");
				secondStage.setScene(scene);
				secondStage.showAndWait();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} else {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Mensaje de error");
			alert.setHeaderText(null);
			alert.setContentText("Usuario y/o clave incorrecta");
			alert.show();
		}
	}

	public void salir() {
		Platform.exit();
	}
}