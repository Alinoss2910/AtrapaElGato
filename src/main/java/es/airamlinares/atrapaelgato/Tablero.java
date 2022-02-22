package es.airamlinares.atrapaelgato;

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
    Logica logica;
    public Tablero(Logica logica) {
        this.logica = logica;
        this.setRadius(20);
        this.setFill(Color.LIGHTBLUE);
    }
    public void gris(ComportamientoGato compGato) {
        this.setOnMousePressed((MouseEvent mouseEvent) -> {
            // Cambia el color del circulo cuando clickas en un circulo
            this.setFill(Color.GREY);
            compGato.movGato();
        });
    }
}
