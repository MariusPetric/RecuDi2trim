package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Bag {

    private Controller controller;

    @FXML
    private Button Volver;

    public void setController1 (Controller sample){
        controller = sample;
        controller.recibirInformacion("JuJaJu");
    }

    public void mandarInfoController(String info){
        System.out.println("Informacion enviada: "+info);
    }

    public void onButtonVolverAppClicked(ActionEvent actionEvent) {
        Stage stage = (Stage) Volver.getScene().getWindow();
        stage.close();


    }


    public void cura1(ActionEvent actionEvent) {
    }

    public void cura4(ActionEvent actionEvent) {
    }

    public void cura3(ActionEvent actionEvent) {
    }

    public void cura2(ActionEvent actionEvent) {
    }
}
