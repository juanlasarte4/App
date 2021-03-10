package JavaFX.controlador;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class principalController {

	@FXML
	public void crearCliente() {
		try {
			Stage thirdStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/JavaFX/vista/altaCliente.fxml"));

			// CARGO LA ESCENA
			Scene scene = new Scene(root);

			// ACTUALIZO LA ESCENA Y LA MUESTRO
			thirdStage.initModality(Modality.APPLICATION_MODAL);
			thirdStage.setTitle("Alta Clientes");
			thirdStage.setScene(scene);
			thirdStage.showAndWait();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}