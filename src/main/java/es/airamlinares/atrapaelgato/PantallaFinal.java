package es.airamlinares.atrapaelgato;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Airam
 */
public class PantallaFinal extends Pane {
    static final int PANTALLA_FINAL_X = 100;
    static final int PANTALLA_FINAL_Y = 100;
    Stage stage;
    public void pantallaPerder() {
        stage.setResizable(false);
        stage.show();
    }
    
    public void pantallaGanar() {
        Pane paneFin = new Pane();
        var scene = new Scene(paneFin, PANTALLA_FINAL_X, PANTALLA_FINAL_Y);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
