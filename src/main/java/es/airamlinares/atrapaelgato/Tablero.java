package es.airamlinares.atrapaelgato;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Airam
 */
public class Tablero extends Circle {
    ImageView imgGato;
    Pane paneRoot;
    public Tablero() {
        this.setRadius(20);
        this.setFill(Color.LIGHTBLUE);
    }
    public void gris(ComportamientoGato compGato) {
        this.setOnMousePressed((MouseEvent mouseEvent) -> {
            // Cambia el color del circulo cuando clickas en uno
            this.setFill(Color.GREY);
            compGato.movGato();
        });
        
    }
}
