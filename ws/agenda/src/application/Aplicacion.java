package application;

import controllers.VentanaAgendaController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Aplicacion extends Application {

	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/views/VentanaAgenda.fxml"));
			AnchorPane anchorPane = (AnchorPane) loader.load();
			VentanaAgendaController ventanaAgendaController = loader.getController();
			VentanaAgendaController.setAplicacion(this);

			Scene scene = new Scene(anchorPane);
			primaryStage.setTitle("Ventana de Agenda");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	}