package JavaFX.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class MainController {
	
	@FXML
	MenuBar menuBar;
	Menu menu;
	MenuItem menuItem1;
	MenuItem menuItem2;
	Tab tab;
	TabPane tabPane;
	AnchorPane anchorPane;
	

	@FXML
	public void saySomething(ActionEvent event) {
		anchorPane.isPressed();
	}
}