package JavaFX;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/JavaFX/vista/Principal.fxml"));

			// CARGO LA ESCENA
			Scene scene = new Scene(root);

			// ACTUALIZO LA ESCENA Y LA MUESTRO
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}