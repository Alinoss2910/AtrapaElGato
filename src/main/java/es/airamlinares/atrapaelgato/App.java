package es.airamlinares.atrapaelgato;

import java.util.Random;
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
        ComportamientoGato compGato = new ComportamientoGato();
        Logica logica = new Logica();
        logica.mostrarTableroConsola();
        for(int x = 30; x<TAM_X_PANTALLA; x+= 45 ) {
            for(int y = 50; y<TAM_Y_PANTALLA; y+= 45 ) {
                Tablero tablero = new Tablero(logica);
                tablero.setCenterX(x);
                tablero.setCenterY(y);
                tablero.gris(compGato);
                paneRoot.getChildren().add(tablero);
            }
        }
        compGato.generarGato(paneRoot);
        for(int i=0; i<=16;i++){
            Random random = new Random();
            int posX = random.nextInt(13);
            int posY = random.nextInt(9);
            System.out.println("posX: " + posX +" "+"posY: " + posY);
            logica.colocarGris(posX, posY);
            logica.movGato();
            logica.mostrarTableroConsola();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}