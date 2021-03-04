package JavaFX.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class MainController implements Initializable {

	/*@FXML
	MenuBar menuBar;
	Menu menu;
	MenuItem menuItem1;
	MenuItem menuItem2;
	Tab tab;
	TabPane tabPane;
	AnchorPane anchorPane;*/

	@FXML
	private Label label;

	@FXML
	private void handleButtonAction(ActionEvent event) {
		System.out.println("You clicked me!");
		label.setText("Hello World!");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	/*@FXML
	public void saySomething(ActionEvent event) {
		anchorPane.isPressed();
	}*/
}