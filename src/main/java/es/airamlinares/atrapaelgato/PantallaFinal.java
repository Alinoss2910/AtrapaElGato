package es.airamlinares.atrapaelgato;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Airam
 */
public class PantallaFinal extends Pane {
    HBox mensajeGanar = new HBox();
    HBox mensajePerder = new HBox();
    public void pantallaPerder() {
        mensajePerder.setAlignment(Pos.CENTER);
        mensajePerder.setSpacing(10);
        mensajePerder.setVisible(false);
        this.getChildren().add(mensajePerder);
        Text perdido = new Text("Has perdido");
        perdido.setFont(Font.font(20));
        perdido.setFill(Color.BLACK);
        mensajePerder.getChildren().add(perdido);
    }
    
    public void pantallaGanar() {
        mensajeGanar.setAlignment(Pos.CENTER);
        mensajeGanar.setSpacing(10);
        mensajeGanar.setVisible(false);
        this.getChildren().add(mensajeGanar);
        Text perdido = new Text("Has ganado");
        perdido.setFont(Font.font(20));
        perdido.setFill(Color.BLACK);
        mensajeGanar.getChildren().add(perdido);
    }
    
    public void ganarVisible() {
        mensajeGanar.setVisible(true);
    }
    
    public void perderVisible() {
        mensajePerder.setVisible(true);
    }
}
