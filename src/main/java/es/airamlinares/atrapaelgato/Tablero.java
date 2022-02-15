package es.airamlinares.atrapaelgato;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Airam
 */
public class Tablero extends Circle {
    final int TAM_X_PANTALLA = 640;
    final int TAM_Y_PANTALLA = 480;
    public Tablero() {
        this.setRadius(20);
        this.setFill(Color.LIGHTBLUE);
        this.setOnMousePressed((MouseEvent mouseEvent) -> {
            // Cambia el color del circulo cuando clickas en uno
            this.setFill(Color.GREY);
        });
    }
    
}
