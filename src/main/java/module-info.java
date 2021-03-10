module App {
	exports JavaFX;
	exports Principal.App;
	exports JavaFX.controlador;
	exports utilidades;
	exports Builder;
	exports Modelos;
	exports Excepciones;
	exports GUI;
	exports PatronDao;
	
	opens JavaFX.controlador to javafx.fxml;
	requires java.desktop;
	requires java.sql;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires junit;
}