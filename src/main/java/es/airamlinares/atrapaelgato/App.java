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
        stage.show();
        for(int x = 30; x<TAM_X_PANTALLA; x+= 45 ) {
            for(int y = 30; y<TAM_Y_PANTALLA; y+= 45 ) {
                Tablero tablero = new Tablero();
                tablero.setCenterX(x);
                tablero.setCenterY(y);
                paneRoot.getChildren().add(tablero);
            }
        }
    }

    public static void main(String[] args) {
        launch();
    }

}