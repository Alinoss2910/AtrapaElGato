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
public class PantallaFinal extends HBox {
    public void pantallaPerder() {
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
        this.setVisible(false);
        this.setTranslateX(200);
        Text perdido = new Text("Has perdido");
        perdido.setFont(Font.font(20));
        perdido.setFill(Color.BLACK);
        this.getChildren().add(perdido);
    }
    
    public void pantallaGanar() {
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
        this.setVisible(false);
        this.setTranslateX(200);
        Text perdido = new Text("Has ganado");
        perdido.setFont(Font.font(20));
        perdido.setFill(Color.BLACK);
        this.getChildren().add(perdido);
    }
    
    public void ganarVisible() {
        this.setVisible(true);
    }
    
    public void perderVisible() {
        this.setVisible(true);
    }
}
