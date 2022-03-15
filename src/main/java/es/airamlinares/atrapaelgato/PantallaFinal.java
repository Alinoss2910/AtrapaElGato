package es.airamlinares.atrapaelgato;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Airam
 */
public class PantallaFinal extends HBox {
    Text perdido;
    Text ganado;
    public void pantallaPerder() {
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
        this.setLayoutX(200);
        perdido = new Text("Has perdido");
        perdido.setFont(Font.font(20));
        perdido.setVisible(false);
        perdido.setFill(Color.BLACK);
//        this.getChildren().add(perdido);
    }
    
    public void pantallaGanar() {
        this.setAlignment(Pos.BOTTOM_LEFT);
        this.setSpacing(10);
        this.setLayoutX(200);
        ganado = new Text("Has ganado");
        ganado.setFont(Font.font(20));
//        ganado.setVisible(false);
        ganado.setFill(Color.BLACK);
//        this.getChildren().add(ganado);
    }
    
    public void ganarVisible() {
//        ganado.setVisible(true);
        this.getChildren().add(ganado);
    }
    
    public void perderVisible() {
//        perdido.setVisible(true);
        this.getChildren().add(perdido);
    }
}
