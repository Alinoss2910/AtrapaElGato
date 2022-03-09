package es.airamlinares.atrapaelgato;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    final int TAM_X_PANTALLA = 640;
    final int TAM_Y_PANTALLA = 480;
    @Override
    public void start(Stage stage) {
        Pane paneRoot = new Pane();
        var scene = new Scene(paneRoot, TAM_X_PANTALLA, TAM_Y_PANTALLA);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
        PantallaFinal panFin = new PantallaFinal();
        
        Tablero tablero = new Tablero(panFin);
        tablero.generarGato();
        paneRoot.getChildren().add(tablero);
        tablero.botonReiniciar(panFin);
        paneRoot.getChildren().add(panFin);
    }

    public static void main(String[] args) {
        launch();
    }

}