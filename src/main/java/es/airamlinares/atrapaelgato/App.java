package es.airamlinares.atrapaelgato;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    final int TAM_X_PANTALLA = 640;
    final int TAM_Y_PANTALLA = 480;
    @Override
    public void start(Stage stage) {
        BorderPane paneRoot = new BorderPane();
        var scene = new Scene(paneRoot, TAM_X_PANTALLA, TAM_Y_PANTALLA);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
        PantallaFinal panFin = new PantallaFinal();
        
        Tablero tablero = new Tablero(panFin);
        tablero.generarGato();
        tablero.botonReiniciar(panFin);
        tablero.botonSalir(stage, panFin);
        paneRoot.setCenter(tablero);
        paneRoot.setBottom(panFin);
    }

    public static void main(String[] args) {
        launch();
    }

}